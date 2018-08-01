package br.com.eng.vvs.wallet.service;

import br.com.eng.vvs.wallet.model.TransactionType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TransactionTypeService extends CrudRepository<TransactionType, Integer> {
}
