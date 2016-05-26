package com.dounine.hyaena.entity.capture;

/**
 * Created by huanghuanlai on 16/5/24.
 */
public class Nav {

    private String name;
    private Long size;

    public Nav(){}

    public Nav(String name, Long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
