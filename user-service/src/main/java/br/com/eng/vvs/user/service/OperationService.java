package br.com.eng.vvs.user.service;

import br.com.eng.vvs.user.model.Operation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface OperationService extends CrudRepository<Operation, Integer> {
}
