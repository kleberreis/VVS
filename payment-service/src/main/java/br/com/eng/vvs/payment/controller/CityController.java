package br.com.eng.vvs.payment.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.payment.model.PaymentCycle;
import br.com.eng.vvs.payment.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class CityController extends BaseControllerImpl<PaymentCycle, Integer> implements BaseController<PaymentCycle> {

    @Autowired
    public CityController(CityService service) {
        super(service);
    }

    @Override
    @PostMapping("/city")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody PaymentCycle model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/cityAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<PaymentCycle> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/city")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<PaymentCycle> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/city/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PaymentCycle findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/city")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody PaymentCycle model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/cityAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<PaymentCycle> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/city")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody PaymentCycle model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/cityAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<PaymentCycle> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/city/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}