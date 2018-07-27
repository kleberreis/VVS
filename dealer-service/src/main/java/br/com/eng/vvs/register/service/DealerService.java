package br.com.eng.vvs.register.service;

import br.com.eng.vvs.register.model.Dealer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface DealerService extends CrudRepository<Dealer, Integer> {
}
