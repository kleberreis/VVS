package br.com.eng.vvs.register.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.register.model.PointSaleOperator;
import br.com.eng.vvs.register.service.PointSaleOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class PointSaleOperatorController extends BaseControllerImpl<PointSaleOperator, Integer> implements BaseController<PointSaleOperator> {

    @Autowired
    public PointSaleOperatorController(PointSaleOperatorService service) {
        super(service);
    }

    @Override
    @PostMapping("/pointSaleOperator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody PointSaleOperator model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/pointSaleOperatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<PointSaleOperator> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/pointSaleOperator")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<PointSaleOperator> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/pointSaleOperator/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PointSaleOperator findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/pointSaleOperator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody PointSaleOperator model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/pointSaleOperatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<PointSaleOperator> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/pointSaleOperator")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody PointSaleOperator model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/pointSaleOperatorAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<PointSaleOperator> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/pointSaleOperator/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}