package br.com.eng.vvs.user.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.user.model.RoleOperation;
import br.com.eng.vvs.user.service.RoleOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class RoleOperationController extends BaseControllerImpl<RoleOperation, Integer> implements BaseController<RoleOperation> {

    @Autowired
    public RoleOperationController(RoleOperationService userService) {
        super(userService);
    }

    @Override
    @PostMapping("/roleOperation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody RoleOperation model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/roleOperationAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<RoleOperation> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/roleOperation")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<RoleOperation> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/roleOperation/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public RoleOperation findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/roleOperation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody RoleOperation model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/roleOperationAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<RoleOperation> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/roleOperation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody RoleOperation model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/roleOperationAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<RoleOperation> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/roleOperation/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}