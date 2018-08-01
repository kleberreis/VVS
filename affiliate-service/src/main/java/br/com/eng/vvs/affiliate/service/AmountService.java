package br.com.eng.vvs.affiliate.service;

import br.com.eng.vvs.affiliate.model.Amount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AmountService extends CrudRepository<Amount, Integer> {
}
