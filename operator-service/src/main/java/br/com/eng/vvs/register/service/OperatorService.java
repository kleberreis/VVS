package br.com.eng.vvs.register.service;

import br.com.eng.vvs.register.model.Operator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface OperatorService extends CrudRepository<Operator, Integer> {
}
