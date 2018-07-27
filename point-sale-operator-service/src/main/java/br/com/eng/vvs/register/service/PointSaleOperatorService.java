package br.com.eng.vvs.register.service;

import br.com.eng.vvs.register.model.PointSaleOperator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PointSaleOperatorService extends CrudRepository<PointSaleOperator, Integer> {
}
