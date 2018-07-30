package br.com.eng.vvs.wallet.service;

import br.com.eng.vvs.wallet.model.TransactionHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TransactionHistoryService extends CrudRepository<TransactionHistory, Integer> {
}
