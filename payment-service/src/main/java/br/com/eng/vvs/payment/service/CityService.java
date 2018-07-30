package br.com.eng.vvs.payment.service;

import br.com.eng.vvs.payment.model.PaymentCycle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CityService extends CrudRepository<PaymentCycle, Integer> {
}
