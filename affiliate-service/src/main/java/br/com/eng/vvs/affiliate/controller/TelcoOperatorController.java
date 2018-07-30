package br.com.eng.vvs.affiliate.controller;

import br.com.eng.vvs.affiliate.model.TelcoOperator;
import br.com.eng.vvs.affiliate.service.TelcoOperatorService;
import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class TelcoOperatorController extends BaseControllerImpl<TelcoOperator, Integer> implements BaseController<TelcoOperator> {

    @Autowired
    public TelcoOperatorController(TelcoOperatorService service) {
        super(service);
    }

    @Override
    @PostMapping("/telcoOperator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody TelcoOperator model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/telcoOperatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<TelcoOperator> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/telcoOperator")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<TelcoOperator> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/telcoOperator/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TelcoOperator findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/telcoOperator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody TelcoOperator model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/telcoOperatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<TelcoOperator> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/telcoOperator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody TelcoOperator model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/telcoOperatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<TelcoOperator> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/telcoOperator/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}