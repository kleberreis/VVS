package br.com.eng.vvs.province.service;

import br.com.eng.vvs.wallet.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CityService extends CrudRepository<City, Integer> {
}
