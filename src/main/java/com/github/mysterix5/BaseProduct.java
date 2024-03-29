package com.github.mysterix5;

import java.util.UUID;

public abstract class BaseProduct {
    private final String id;
    private final String name;

    public BaseProduct(String name){
        id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "BaseProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
