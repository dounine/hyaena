package com.dounine.hyaena.entity.capture;

/**
 * Created by huanghuanlai on 16/5/24.
 */
public class MDatabase {

    private String id;
    private String name;

    public MDatabase(){}

    public MDatabase(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
