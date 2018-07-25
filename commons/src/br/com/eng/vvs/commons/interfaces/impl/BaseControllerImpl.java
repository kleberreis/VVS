package br.com.eng.vvs.commons.interfaces.impl;

import br.com.eng.vvs.commons.interfaces.BaseController;
import br.com.eng.vvs.commons.interfaces.BaseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.data.repository.CrudRepository;

import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.Set;

/**
 * Criado por Raphael em 18/07/18.
 */
@SuppressWarnings("unchecked")
public class BaseControllerImpl<MODEL extends BaseModel, ID extends Serializable> implements BaseController<MODEL> {

    private CrudRepository<MODEL, ID> repository;

    private Class<MODEL> modelClass;

    private final Logger log;

    @Autowired
    public BaseControllerImpl(CrudRepository<MODEL, ID> repository) {
        this.repository = repository;
        modelClass = (Class<MODEL>) GenericTypeResolver.resolveTypeArguments(getClass(), BaseController.class)[0];
        log = LoggerFactory.getLogger(modelClass);
    }

    @Override
    public Response insert(MODEL model) {
        log.debug(String.format("%sService - Insert One - %s", modelClass.getSimpleName(), model));
        if (model == null)
            return Response.status(Response.Status.NO_CONTENT).build();

        try {
            repository.save(model);
        } catch (Exception e) {
            log.error(String.format("%sService - Insert One Error - %s", modelClass.getSimpleName(), model), e);
            return Response.serverError().build();
        }

        return Response.ok(model).build();
    }

    @Override
    public Response insertAll(Set<MODEL> modelSet) {
        log.debug(String.format("%sService - Insert All - %s", modelClass.getSimpleName(), modelSet == null ? null : modelSet.size()));
        if (modelSet == null || modelSet.isEmpty())
            return Response.status(Response.Status.NO_CONTENT).build();

        try {
            repository.save(modelSet);
        } catch (Exception e) {
            log.error(String.format("%sService - Insert All Error - %d", modelClass.getSimpleName(), modelSet.size()), e);
            return Response.serverError().build();
        }

        return Response.ok(modelSet).build();
    }

    @Override
    public Iterable<MODEL> findAll() {
        return repository.findAll();
    }

    @Override
    public MODEL findById(Integer id) {
        log.debug(String.format("%sService - Find by Id - %d", modelClass.getSimpleName(), id));
        if (id == null)
            return null;

        try {
            return repository.findOne((ID) id);
        } catch (Exception e) {
            log.error(String.format("%sService - Find by Id Error - %d", modelClass.getSimpleName(), id), e);
            throw e;
        }
    }

    @Override
    public Response update(MODEL model) {
        log.debug(String.format("%sService - Update One - %s", modelClass.getSimpleName(), model));
        if (model == null)
            return Response.status(Response.Status.NO_CONTENT).build();

        try {
            repository.save(model);
        } catch (Exception e) {
            log.error(String.format("%sService - Update One Error - %s", modelClass.getSimpleName(), model), e);
            return Response.serverError().build();
        }

        return Response.ok(model).build();
    }

    @Override
    public Response updateAll(Set<MODEL> repositorySet) {
        log.debug(String.format("%sService - Update All - %d", modelClass.getSimpleName(), repositorySet == null ? null : repositorySet.size()));
        if (repositorySet == null || repositorySet.isEmpty())
            return Response.status(Response.Status.NO_CONTENT).build();

        try {
            repository.save(repositorySet);
        } catch (Exception e) {
            log.error(String.format("%sService - Update All Error - %d", modelClass.getSimpleName(), repositorySet.size()), e);
            return Response.serverError().build();
        }

        return Response.ok(repositorySet).build();
    }

    @Override
    public Response delete(MODEL model) {
        log.debug(String.format("%sService - Delete One - %s", modelClass.getSimpleName(), model));
        if (model == null)
            return Response.ok("Delete successful").build();

        try {
            repository.delete(model);
        } catch (Exception e) {
            log.error(String.format("%sService - Delete One Error - %s", modelClass.getSimpleName(), model), e);
            return Response.serverError().build();
        }

        return Response.ok("Delete successful").build();
    }

    @Override
    public Response deleteAll(Set<MODEL> modelSet) {
        log.debug(String.format("%sService - Delete All - %d", modelClass.getSimpleName(), modelSet == null ? null : modelSet.size()));

        if (modelSet == null || modelSet.isEmpty())
            return Response.ok("Delete successful").build();

        try {
            repository.delete(modelSet);
        } catch (Exception e) {
            log.error(String.format("%sService - Delete All Error - %d", modelClass.getSimpleName(), modelSet.size()), e);
            return Response.serverError().build();
        }

        return Response.ok("Delete successful").build();
    }

    @Override
    public Response deleteById(Integer id) {
        log.debug(String.format("%sService - Delete by Id - %d", modelClass.getSimpleName(), id));

        if (id == null)
            return Response.ok("Delete successful").build();

        try {
            repository.delete((ID) id);
        } catch (Exception e) {
            log.error(String.format("%sService - Delete by Id Error - %d", modelClass.getSimpleName(), id), e);
            return Response.serverError().build();
        }

        return Response.ok("Delete successful").build();
    }
}
