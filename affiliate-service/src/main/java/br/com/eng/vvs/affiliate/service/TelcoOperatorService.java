package br.com.eng.vvs.affiliate.service;

import br.com.eng.vvs.affiliate.model.TelcoOperator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TelcoOperatorService extends CrudRepository<TelcoOperator, Integer> {
}
