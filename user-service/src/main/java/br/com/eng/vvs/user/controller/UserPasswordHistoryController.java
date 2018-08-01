package br.com.eng.vvs.user.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.user.model.User;
import br.com.eng.vvs.user.model.UserPasswordHistory;
import br.com.eng.vvs.user.service.UserPasswordHistoryService;
import br.com.eng.vvs.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@RestController
public class UserPasswordHistoryController extends BaseControllerImpl<UserPasswordHistory, Integer> implements BaseController<UserPasswordHistory> {

    private UserPasswordHistoryService historyService;
    private UserService userService;

    @Autowired
    public UserPasswordHistoryController(UserPasswordHistoryService historyService, UserService userService) {
        super(historyService);
        this.historyService = historyService;
        this.userService = userService;
    }

    @Override
    @GetMapping("/passwordHistory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserPasswordHistory findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @GetMapping("/passwordHistory/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<UserPasswordHistory> findAllByUserId(@PathVariable("id") Integer id) {
        Iterable<UserPasswordHistory> list = new ArrayList<>();
        if (id == null)
            return list;
        User user = userService.findOne(id);
        if (user == null)
            return list;

        return historyService.getAllByUser(user);
    }
}