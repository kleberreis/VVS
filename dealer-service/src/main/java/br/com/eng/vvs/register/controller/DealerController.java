package br.com.eng.vvs.register.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.register.model.Dealer;
import br.com.eng.vvs.register.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class DealerController extends BaseControllerImpl<Dealer, Integer> implements BaseController<Dealer> {

    @Autowired
    public DealerController(DealerService service) {
        super(service);
    }

    @Override
    @PostMapping("/dealer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Dealer model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/dealerAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Dealer> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/dealer")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Dealer> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/dealer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Dealer findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/dealer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Dealer model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/dealerAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Dealer> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/dealer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Dealer model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/dealerAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Dealer> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/dealer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}