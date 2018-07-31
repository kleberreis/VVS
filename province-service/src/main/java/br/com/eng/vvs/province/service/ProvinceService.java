package br.com.eng.vvs.province.service;

import br.com.eng.vvs.province.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProvinceService extends CrudRepository<Province, Integer> {
}
