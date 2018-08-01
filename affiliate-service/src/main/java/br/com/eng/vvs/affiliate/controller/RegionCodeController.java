package br.com.eng.vvs.affiliate.controller;

import br.com.eng.vvs.affiliate.model.RegionCode;
import br.com.eng.vvs.affiliate.service.RegionCodeService;
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
public class RegionCodeController extends BaseControllerImpl<RegionCode, Integer> implements BaseController<RegionCode> {

    @Autowired
    public RegionCodeController(RegionCodeService service) {
        super(service);
    }

    @Override
    @PostMapping("/regionCode")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody RegionCode model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/regionCodeAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<RegionCode> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/regionCode")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<RegionCode> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/regionCode/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public RegionCode findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/regionCode")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody RegionCode model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/regionCodeAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<RegionCode> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/regionCode")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody RegionCode model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/regionCodeAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<RegionCode> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/regionCode/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}