package br.com.eng.vvs.affiliate.controller;

import br.com.eng.vvs.affiliate.model.AmountRegion;
import br.com.eng.vvs.affiliate.service.AmountRegionService;
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
public class AmountRegionController extends BaseControllerImpl<AmountRegion, Integer> implements BaseController<AmountRegion> {

    @Autowired
    public AmountRegionController(AmountRegionService service) {
        super(service);
    }

    @Override
    @PostMapping("/amountRegion")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody AmountRegion model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/amountRegionAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<AmountRegion> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/amountRegion")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<AmountRegion> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/amountRegion/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public AmountRegion findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/amountRegion")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody AmountRegion model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/amountRegionAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<AmountRegion> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/amountRegion")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody AmountRegion model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/amountRegionAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<AmountRegion> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/amountRegion/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}