package br.com.eng.vvs.user.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.user.model.Operation;
import br.com.eng.vvs.user.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class OperationController extends BaseControllerImpl<Operation, Integer> implements BaseController<Operation> {

    @Autowired
    public OperationController(OperationService userService) {
        super(userService);
    }

    @Override
    @PostMapping("/operation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Operation model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/operationAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Operation> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/operation")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Operation> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/operation{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Operation findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/operation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Operation model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/operationAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Operation> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/operation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Operation model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/operationAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Operation> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/operation{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}