package br.com.eng.vvs.user.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.user.model.Role;
import br.com.eng.vvs.user.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class RoleController extends BaseControllerImpl<Role, Integer> implements BaseController<Role> {

    @Autowired
    public RoleController(RoleService roleService) {
        super(roleService);
    }

    @Override
    @PostMapping("/role")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Role model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/roleAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Role> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/role")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Role> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/role/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Role findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/role")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Role model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/roleAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Role> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/role")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Role model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/roleAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Role> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/role/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}