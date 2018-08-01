package br.com.eng.vvs.province.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.eng.vvs.province.model.Province;
import br.com.eng.vvs.province.service.ProvinceService;;

@RestController
public class ProvinceController{

	@Autowired
	private ProvinceService service;

    @GetMapping("/province")
    public Iterable<Province> getAllProvinces(){
    	service.findAll().forEach(e -> System.out.println(e));
    	return service.findAll();
    }
    
    @GetMapping("/province/{id}")
    public Province getProvince(@PathVariable("id") Integer id){
    	return service.findOne(id);
    }
    
    @DeleteMapping("/province/{id}")
    public void deleteProvince(@PathVariable("id") Integer id){
    	service.delete(id);
    	
    	//return Response.ok().build();
    }
    
    @PostMapping("/province")
    public Province insertProvince(@RequestBody Province province){
    	service.save(province);
    	
    	return service.findOne(province.getId());
    	//return Response.created(URI.create(String.format("/province/%s",province.getId().toString()))).build();
    }
    
    @PutMapping("/province")
    public Province updateProvince(@RequestBody Province province){
    	service.save(province);
    	
    	return service.findOne(province.getId());
    	//return Response.ok(province).build();
    }
}
