package br.com.eng.vvs.wallet.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.wallet.model.TransactionType;
import br.com.eng.vvs.wallet.service.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class TransactionTypeController extends BaseControllerImpl<TransactionType, Integer> implements BaseController<TransactionType> {

    @Autowired
    public TransactionTypeController(TransactionTypeService service) {
        super(service);
    }

    @Override
    @PostMapping("/transactionType")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody TransactionType model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/transactionTypeAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<TransactionType> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/transactionType")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<TransactionType> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/transactionType/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TransactionType findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/transactionType")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody TransactionType model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/transactionTypeAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<TransactionType> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/transactionType")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody TransactionType model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/transactionTypeAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<TransactionType> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/transactionType/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}