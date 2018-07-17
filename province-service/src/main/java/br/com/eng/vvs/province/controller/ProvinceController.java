package br.com.eng.vvs.province.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eng.vvs.province.model.Province;
import br.com.eng.vvs.province.service.ProvinceService;;

@RestController
public class ProvinceController{

	@Autowired
	private ProvinceService service;

    @GetMapping("/provinces")
    public Iterable<Province> getSentence(){
    	/*return services.stream()
                .map(handler::consume)
                .collect(Collectors.joining(" "));*/
    	service.findAll().forEach(e -> System.out.println(e));
    	return service.findAll();
    }
}
