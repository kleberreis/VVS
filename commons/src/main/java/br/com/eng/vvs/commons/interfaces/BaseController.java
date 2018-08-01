package br.com.eng.vvs.commons.interfaces;

import javax.ws.rs.core.Response;
import java.util.Set;

/**
 * Criado por Raphael em 17/07/18.
 */
public interface BaseController<MODEL> {
    Response insert(MODEL repository);
    Response insertAll(Set<MODEL> repositorySet);

    Iterable<MODEL> findAll();
    MODEL findById(Integer id) throws Exception;

    Response update(MODEL repository);
    Response updateAll(Set<MODEL> repositorySet);

    Response delete(MODEL repository);
    Response deleteAll(Set<MODEL> repositorySet);
    Response deleteById(Integer id);
}