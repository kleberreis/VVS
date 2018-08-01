package br.com.eng.vvs.register.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.register.model.RechargePoint;
import br.com.eng.vvs.register.service.RechargePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class RechargePointController extends BaseControllerImpl<RechargePoint, Integer> implements BaseController<RechargePoint> {

    @Autowired
    public RechargePointController(RechargePointService service) {
        super(service);
    }

    @Override
    @PostMapping("/rechargePoint")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody RechargePoint model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/rechargePointAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<RechargePoint> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/rechargePoint")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<RechargePoint> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/rechargePoint/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public RechargePoint findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/rechargePoint")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody RechargePoint model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/rechargePointAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<RechargePoint> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/rechargePoint")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody RechargePoint model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/rechargePointAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<RechargePoint> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/rechargePoint/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}