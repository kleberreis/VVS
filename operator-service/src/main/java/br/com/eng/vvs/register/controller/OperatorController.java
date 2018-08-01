package br.com.eng.vvs.register.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.register.model.Operator;
import br.com.eng.vvs.register.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class OperatorController extends BaseControllerImpl<Operator, Integer> implements BaseController<Operator> {

    @Autowired
    public OperatorController(OperatorService service) {
        super(service);
    }

    @Override
    @PostMapping("/operator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Operator model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/operatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Operator> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/operator")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Operator> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/operator/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Operator findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/operator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Operator model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/operatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Operator> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/operator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Operator model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/operatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Operator> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/operator/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}