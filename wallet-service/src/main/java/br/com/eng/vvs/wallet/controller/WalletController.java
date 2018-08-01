package br.com.eng.vvs.wallet.controller;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.impl.BaseControllerImpl;
import br.com.eng.vvs.wallet.model.Transfer;
import br.com.eng.vvs.wallet.model.Wallet;
import br.com.eng.vvs.wallet.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@RestController
public class WalletController extends BaseControllerImpl<Wallet, Integer> implements BaseController<Wallet> {

    @Autowired
    public WalletController(WalletService service) {
        super(service);
    }

    @Override
    @PostMapping("/wallet")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@RequestBody Wallet model) {
        return super.insert(model);
    }

    @Override
    @PostMapping("/walletAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertAll(@RequestBody Set<Wallet> modelSet) {
        return super.insertAll(modelSet);
    }

    @Override
    @GetMapping("/wallet")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Wallet> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("/wallet/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Wallet findById(@PathVariable("id") Integer id) {
        return super.findById(id);
    }

    @Override
    @PutMapping("/wallet")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@RequestBody Wallet model) {
        return super.update(model);
    }

    @Override
    @PutMapping("/walletAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAll(@RequestBody Set<Wallet> repositorySet) {
        return super.updateAll(repositorySet);
    }

    @DeleteMapping("/wallet")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@RequestBody Wallet model) {
        return super.delete(model);
    }

    @Override
    @DeleteMapping("/walletAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAll(@RequestBody Set<Wallet> modelSet) {
        return super.deleteAll(modelSet);
    }

    @Override
    @DeleteMapping("/wallet/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteById(@PathVariable("id") Integer id) {
        return super.deleteById(id);
    }

    @PostMapping("/transfer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response transfer(@RequestBody Transfer model) {
        return Response.ok().build();
    }
}