package br.com.eng.vvs.user.service;

import br.com.eng.vvs.user.model.UserPasswordHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserHistoryService extends CrudRepository<UserPasswordHistory, Integer> {
}
