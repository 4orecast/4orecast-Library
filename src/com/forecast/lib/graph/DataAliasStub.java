package com.forecast.lib.graph;

import java.io.Serializable;

/**
 * Created by Zachary on 4/5/2017.
 */
public class DataAliasStub implements Serializable {

    private double data;
    private String value;

    public DataAliasStub(final double data, final String value) {
        this.data = data;
        this.value = value;
    }

    public double getData() {
        return data;
    }

    public String getValue() {
        return value;
    }
}
