package com.dounine.hyaena.dao;

import com.dounine.hyaena.utils.GenericsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by huanghuanlai on 16/4/28.
 */
@Repository
public class RepositoryImpl<T> implements IRepository<T>{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryImpl.class);

    @PostConstruct
    public void inits() {
        LOGGER.info("****  (hyaena-dao) -> inits  ****");
    }

    @Autowired
    MongoTemplate mongoTemplate;

    protected Class<T> clazz;

    public RepositoryImpl() {
        clazz = GenericsUtil.getSuperClassGenricType(this.getClass());
    }


    @Override
    public List<T> getAllObjects() {
        return mongoTemplate.findAll(clazz);
    }

    @Override
    public void saveObject(T object) {
        mongoTemplate.save(object);
    }

    @Override
    public T getObject(String id) {
        return mongoTemplate.findById(id, clazz);
    }

    @Override
    public void deleteObject(String id) {
        mongoTemplate.remove(new Query(Criteria.where("id").is(id)));
    }

    @Override
    public void updateObject(T object) {

    }

    @Override
    public Long countObject() {
        return 0l;
    }
}
