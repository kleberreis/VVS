package br.com.eng.vvs.province.controller;


import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.province.model.Province;
import br.com.eng.vvs.province.service.ProvinceService;

@RestController
public class ProvinceController extends BaseControllerImpl<Province, Integer> implements BaseController<Province> {

    @Autowired
    public ProvinceController(ProvinceService service) {
        super(service);
    }

    @Override
    @PostMapping("/province")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Province model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/provinceAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Province> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/province")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Province> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/province/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Province findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/province")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Province model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/provinceAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Province> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/province")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Province model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/provinceAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Province> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/province/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}