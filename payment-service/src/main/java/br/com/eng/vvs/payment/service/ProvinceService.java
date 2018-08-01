package br.com.eng.vvs.payment.service;

import br.com.eng.vvs.payment.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProvinceService extends CrudRepository<Province, Integer> {
}
