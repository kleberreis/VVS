package br.com.eng.vvs.affiliate.controller;

import br.com.eng.vvs.affiliate.model.Affiliate;
import br.com.eng.vvs.affiliate.service.AffiliateService;
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
public class AffiliateController extends BaseControllerImpl<Affiliate, Integer> implements BaseController<Affiliate> {

    @Autowired
    public AffiliateController(AffiliateService service) {
        super(service);
    }

    @Override
    @PostMapping("/affiliate")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Affiliate model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/affiliateAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Affiliate> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/affiliate")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Affiliate> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/affiliate/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Affiliate findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/affiliate")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Affiliate model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/affiliateAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Affiliate> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/affiliate")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Affiliate model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/affiliateAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Affiliate> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/affiliate/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}