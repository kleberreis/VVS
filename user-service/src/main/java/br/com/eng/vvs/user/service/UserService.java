package br.com.eng.vvs.user.service;

import br.com.eng.vvs.user.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends CrudRepository<User, Integer> {
}
