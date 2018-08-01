package br.com.eng.vvs.affiliate.service;

import br.com.eng.vvs.affiliate.model.Affiliate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AffiliateService extends CrudRepository<Affiliate, Integer> {
}
