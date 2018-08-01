package br.com.eng.vvs.province.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.province.model.City;
import br.com.eng.vvs.province.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class CityController extends BaseControllerImpl<City, Integer> implements BaseController<City> {

    @Autowired
    public CityController(CityService service) {
        super(service);
    }

    @Override
    @PostMapping("/city")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody City model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/cityAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<City> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/city")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<City> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/city/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public City findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/city")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody City model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/cityAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<City> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/city")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody City model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/cityAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<City> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/city/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}