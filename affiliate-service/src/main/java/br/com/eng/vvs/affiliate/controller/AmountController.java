package br.com.eng.vvs.affiliate.controller;

import br.com.eng.vvs.affiliate.model.Amount;
import br.com.eng.vvs.affiliate.service.AmountService;
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
public class AmountController extends BaseControllerImpl<Amount, Integer> implements BaseController<Amount> {

    @Autowired
    public AmountController(AmountService service) {
        super(service);
    }

    @Override
    @PostMapping("/amount")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Amount model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/amountAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Amount> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/amount")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Amount> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/amount/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Amount findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/amount")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Amount model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/amountAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Amount> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/amount")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Amount model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/amountAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Amount> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/amount/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}