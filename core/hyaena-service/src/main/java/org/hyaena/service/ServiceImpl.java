package org.hyaena.service;

import org.hyaena.dao.IRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by huanghuanlai on 16/4/28.
 */
public abstract class ServiceImpl<T> implements IService<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceImpl.class);
    @PostConstruct
    public void inits(){
        LOGGER.info("****  (hyaena-service) -> inits  ****");
    }

    @Autowired
    protected IRepository<T> repository;

    @Override
    public List<T> getAllObjects() {
        return repository.getAllObjects();
    }

    @Override
    public void saveObject(T object) {
        repository.saveObject(object);
    }

    @Override
    public T getObject(String id) {
        return repository.getObject(id);
    }

    @Override
    public void deleteObject(String id) {
        repository.deleteObject(id);
    }

    @Override
    public void updateObject(T object) {
        repository.updateObject(object);
    }
}
