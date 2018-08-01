package br.com.eng.vvs.wallet.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.wallet.model.Transaction;
import br.com.eng.vvs.wallet.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class TransactionController extends BaseControllerImpl<Transaction, Integer> implements BaseController<Transaction> {

    @Autowired
    public TransactionController(TransactionService service) {
        super(service);
    }

    @Override
    @PostMapping("/transaction")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Transaction model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/transactionAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Transaction> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/transaction")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Transaction> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/transaction/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Transaction findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/transaction")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Transaction model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/transactionAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Transaction> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/transaction")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Transaction model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/transactionAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Transaction> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/transaction/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}