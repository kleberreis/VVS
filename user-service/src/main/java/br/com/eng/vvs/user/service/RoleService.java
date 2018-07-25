package br.com.eng.vvs.user.service;

import br.com.eng.vvs.user.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface RoleService extends CrudRepository<Role, Integer> {
}
