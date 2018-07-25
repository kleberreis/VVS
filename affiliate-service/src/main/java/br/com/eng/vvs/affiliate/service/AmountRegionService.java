package br.com.eng.vvs.affiliate.service;

import br.com.eng.vvs.affiliate.model.AmountRegion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AmountRegionService extends CrudRepository<AmountRegion, Integer> {
}
