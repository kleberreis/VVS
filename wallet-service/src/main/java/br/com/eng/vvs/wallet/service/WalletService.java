package br.com.eng.vvs.wallet.service;

import br.com.eng.vvs.wallet.model.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface WalletService extends CrudRepository<Wallet, Integer> {
}
