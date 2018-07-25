package br.com.eng.vvs.user.service;

import br.com.eng.vvs.user.model.User;
import br.com.eng.vvs.user.model.UserPasswordHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserPasswordHistoryService extends CrudRepository<UserPasswordHistory, Integer> {
    Set<UserPasswordHistory> getAllByUser(User id);

}
