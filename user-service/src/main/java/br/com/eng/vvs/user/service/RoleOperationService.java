package br.com.eng.vvs.user.service;

import br.com.eng.vvs.user.model.RoleOperation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface RoleOperationService extends CrudRepository<RoleOperation, Integer> {
}
