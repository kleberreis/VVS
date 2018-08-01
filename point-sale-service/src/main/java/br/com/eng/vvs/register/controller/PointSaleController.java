package br.com.eng.vvs.register.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.register.model.PointSale;
import br.com.eng.vvs.register.service.PointSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class PointSaleController extends BaseControllerImpl<PointSale, Integer> implements BaseController<PointSale> {

    @Autowired
    public PointSaleController(PointSaleService service) {
        super(service);
    }

    @Override
    @PostMapping("/pointSale")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody PointSale model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/pointSaleAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<PointSale> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/pointSale")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<PointSale> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/pointSale/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PointSale findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/pointSale")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody PointSale model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/pointSaleAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<PointSale> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/pointSale")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody PointSale model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/pointSaleAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<PointSale> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/pointSale/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}