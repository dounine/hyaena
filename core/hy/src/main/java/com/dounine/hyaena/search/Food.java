package com.dounine.hyaena.search;

/**
 * Created by huanghuanlai on 16/5/27.
 */
public class Food {
    private String name;

    public Food(){}

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name==null?0:name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(null==obj){
            return false;
        }
        if(name.equals(((Food)obj).getName())){
            return true;
        }
        return super.equals(obj);
    }
}
