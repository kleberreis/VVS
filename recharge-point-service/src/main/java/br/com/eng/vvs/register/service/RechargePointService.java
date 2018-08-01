package br.com.eng.vvs.register.service;

import br.com.eng.vvs.register.model.RechargePoint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface RechargePointService extends CrudRepository<RechargePoint, Integer> {
}
