package br.com.eng.vvs.register.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.register.model.BankInfo;
import br.com.eng.vvs.register.model.Dealer;
import br.com.eng.vvs.register.service.BankInfoService;
import br.com.eng.vvs.register.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class BankInfoController extends BaseControllerImpl<BankInfo, Integer> implements BaseController<BankInfo> {

    @Autowired
    public BankInfoController(BankInfoService service) {
        super(service);
    }

    @Override
    @PostMapping("/bankInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody BankInfo model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/bankInfoAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<BankInfo> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/bankInfo")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<BankInfo> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/bankInfo/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BankInfo findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/bankInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody BankInfo model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/bankInfoAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<BankInfo> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/bankInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody BankInfo model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/bankInfoAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<BankInfo> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/bankInfo/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}