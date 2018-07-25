package br.com.eng.vvs.affiliate.service;

import br.com.eng.vvs.affiliate.model.RegionCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface RegionCodeService extends CrudRepository<RegionCode, Integer> {
}
