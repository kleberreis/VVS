package br.com.eng.vvs.user.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.user.model.User;
import br.com.eng.vvs.user.model.UserPasswordHistory;
import br.com.eng.vvs.user.service.UserPasswordHistoryService;
import br.com.eng.vvs.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;

@RestController
public class UserController extends BaseControllerImpl<User, Integer> implements BaseController<User> {

    private UserService userService;
    private UserPasswordHistoryService historyService;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserController(UserService userService, UserPasswordHistoryService historyService, PasswordEncoder passwordEncoder) {
        super(userService);
        this.userService = userService;
        this.historyService = historyService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @PostMapping("/user")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody User model) {
        model.setPassword(passwordEncoder.encode(model.getPassword()));
        return super.insert(model);
    }

    @Override
    @PostMapping("/userAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<User> modelSet) {
        modelSet.forEach(user -> user.setPassword(passwordEncoder.encode(user.getPassword())));
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/user")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<User> findAll() {
        Iterable<User> all = super.findAll();
        for (User user : all) {
            JsonControler.populateUserCity(user);
        }
        return all;
    }

    @Override
    @GetMapping("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/user")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody User model) {
        Optional.of(model.getPasswordRaw())
                .ifPresent(s -> {
                    model.setLastPasswordDate(LocalDate.now());
                    model.setPassword(passwordEncoder.encode(model.getPasswordRaw()));
                    UserPasswordHistory history = new UserPasswordHistory(model);
                    historyService.save(history);
                });
        return super.update(model);
    }

    @Override
    @PutMapping("/userAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<User> repositorySet) {
        repositorySet.forEach(user -> Optional.of(user.getPasswordRaw())
                .ifPresent(s -> {
                    user.setLastPasswordDate(LocalDate.now());
                    user.setPassword(passwordEncoder.encode(user.getPasswordRaw()));
                    UserPasswordHistory history = new UserPasswordHistory(user);
                    historyService.save(history);
                }));
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/user")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody User model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/userAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<User> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }

    @GetMapping("/user/city/{cityId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<User> findAllByCityId(@PathVariable("cityId") Integer cityId) {
        Iterable<User> all = userService.getAllByCityId(cityId);
        for (User user : all) {
            JsonControler.populateUserCity(user);
        }
        return all;
    }

    @PostMapping("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response validate(@RequestBody User model) {
        if (model == null || !passwordEncoder.matches(model.getPasswordRaw(), model.getPassword()))
            return Response.status(Response.Status.UNAUTHORIZED).build();

        model.setLastLoginDateCache(model.getLastLoginDate());
        model.setLastLoginDate(LocalDate.now());
        userService.save(model);
        return Response.ok().build();
    }
}