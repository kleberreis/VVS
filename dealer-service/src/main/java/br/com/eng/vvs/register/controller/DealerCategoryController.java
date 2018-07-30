package br.com.eng.vvs.register.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.register.model.DealerCategory;
import br.com.eng.vvs.register.service.DealerCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class DealerCategoryController extends BaseControllerImpl<DealerCategory, Integer> implements BaseController<DealerCategory> {

    @Autowired
    public DealerCategoryController(DealerCategoryService service) {
        super(service);
    }

    @Override
    @PostMapping("/dealerCategory")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody DealerCategory model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/dealerCategoryAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<DealerCategory> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/dealerCategory")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<DealerCategory> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/dealerCategory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public DealerCategory findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/dealerCategory")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody DealerCategory model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/dealerCategoryAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<DealerCategory> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/dealerCategory")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody DealerCategory model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/dealerCategoryAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<DealerCategory> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/dealerCategory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}