package org.hyaena.entity;

import javax.annotation.PostConstruct;

/**
 * Created by huanghuanlai on 16/4/28.
 */
public class BaseEntity {

    @PostConstruct
    public void inits(){
        System.err.println("****  (hyaena-entity) -> inits  ****");
    }
}
