package br.com.eng.vvs.distributor.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.eng.vvs.distributor.model.Distributor;

@Service
public interface DistributorService extends CrudRepository<Distributor, Integer>{

}
