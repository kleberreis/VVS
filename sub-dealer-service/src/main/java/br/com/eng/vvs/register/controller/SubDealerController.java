package br.com.eng.vvs.register.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.register.model.SubDealer;
import br.com.eng.vvs.register.service.SubDealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class SubDealerController extends BaseControllerImpl<SubDealer, Integer> implements BaseController<SubDealer> {

    @Autowired
    public SubDealerController(SubDealerService service) {
        super(service);
    }

    @Override
    @PostMapping("/subDealer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody SubDealer model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/subDealerAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<SubDealer> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/subDealer")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<SubDealer> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/subDealer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SubDealer findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/subDealer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody SubDealer model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/subDealerAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<SubDealer> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/subDealer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody SubDealer model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/subDealerAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<SubDealer> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/subDealer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}