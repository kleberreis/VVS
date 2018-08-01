package br.com.eng.vvs.distributor.controller;

import java.net.URI;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.eng.vvs.distributor.model.Distributor;
import br.com.eng.vvs.distributor.service.DistributorService;;

@RestController
public class DistributorController{

	@Autowired
	private DistributorService service;

    @GetMapping("/distributor")
    public Iterable<Distributor> getAllDistributors(){
    	service.findAll().forEach(e -> System.out.println(e));
    	return service.findAll();
    }
    
    @GetMapping("/distributor/{id}")
    public Distributor getDistributor(@PathVariable("id") Integer id){
    	return service.findOne(id);
    }
    
    @DeleteMapping("/distributor/{id}")
    public Response deleteDistributor(@PathVariable("id") Integer id){
    	service.delete(id);
    	
    	return Response.ok().build();
    }
    
    @PostMapping("/distributor")
    public Response insertDistributor(@RequestBody Distributor distributor){
    	service.save(distributor);
    	
    	return Response.created(URI.create(String.format("/province/%s",distributor.getId().toString()))).build();
    }
    
    @PutMapping("/distributor")
    public Response updateDistributor(@RequestBody Distributor distributor){
    	service.save(distributor);
    	
    	return Response.ok(distributor).build();
    }
}
