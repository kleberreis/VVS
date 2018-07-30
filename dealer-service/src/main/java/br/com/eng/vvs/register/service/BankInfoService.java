package br.com.eng.vvs.register.service;

import br.com.eng.vvs.register.model.BankInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface BankInfoService extends CrudRepository<BankInfo, Integer> {
}
