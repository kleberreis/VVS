package br.com.eng.vvs.province.service;

import br.com.eng.vvs.province.model.City;
import br.com.eng.vvs.province.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CityService extends CrudRepository<City, Integer> {
}
