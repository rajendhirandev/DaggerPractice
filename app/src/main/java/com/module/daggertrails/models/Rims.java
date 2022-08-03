package com.module.daggertrails.models;

import javax.inject.Inject;

public class Rims {

    @Inject
    public Rims() {
    }

    String rimType;

    public String getRimType() {
        return rimType;
    }

    public void setRimType(String rimType) {
        this.rimType = rimType;
    }
}