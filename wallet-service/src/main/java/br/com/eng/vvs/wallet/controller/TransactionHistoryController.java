package br.com.eng.vvs.wallet.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.wallet.model.TransactionHistory;
import br.com.eng.vvs.wallet.service.TransactionHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class TransactionHistoryController extends BaseControllerImpl<TransactionHistory, Integer> implements BaseController<TransactionHistory> {

    @Autowired
    public TransactionHistoryController(TransactionHistoryService service) {
        super(service);
    }

    @Override
    @PostMapping("/transactionHistory")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody TransactionHistory model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/transactionHistoryAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<TransactionHistory> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/transactionHistory")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<TransactionHistory> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/transactionHistory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TransactionHistory findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/transactionHistory")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody TransactionHistory model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/transactionHistoryAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<TransactionHistory> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/transactionHistory")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody TransactionHistory model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/transactionHistoryAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<TransactionHistory> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/transactionHistory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }
}