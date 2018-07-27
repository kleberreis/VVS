package br.com.eng.vvs.register.service;

import br.com.eng.vvs.register.model.PointSale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PointSaleService extends CrudRepository<PointSale, Integer> {
}
