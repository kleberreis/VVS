package br.com.eng.vvs.province.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.eng.vvs.province.model.Province;

@Service
public interface ProvinceService extends CrudRepository<Province, Integer>{

}
