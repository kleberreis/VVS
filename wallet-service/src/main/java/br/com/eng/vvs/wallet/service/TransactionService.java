package br.com.eng.vvs.wallet.service;

import br.com.eng.vvs.wallet.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService extends CrudRepository<Transaction, Integer> {
}
