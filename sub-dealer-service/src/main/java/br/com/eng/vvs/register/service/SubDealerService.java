package br.com.eng.vvs.register.service;

import br.com.eng.vvs.register.model.SubDealer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface SubDealerService extends CrudRepository<SubDealer, Integer> {
}
