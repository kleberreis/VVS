package br.com.eng.vvs.register.service;

import br.com.eng.vvs.register.model.DealerCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface DealerCategoryService extends CrudRepository<DealerCategory, Integer> {
}
