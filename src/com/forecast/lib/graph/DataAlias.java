package com.forecast.lib.graph;

import java.io.Serializable;

/**
 * Created by Zachary on 4/3/2017.
 */
public abstract class DataAlias implements Serializable {

    private String name;

    public DataAlias(final String name) {
        this.name = name;
    }

    public abstract String convertData(final double data);

    public abstract double convertValue(final String value);

    public String getName() {
        return name;
    }

    public DataAliasStub createStub(final double data) {
        return new DataAliasStub(data, this.convertData(data));
    }

    public DataAliasStub createStub(final String value) {
        return new DataAliasStub(this.convertValue(value), value);
    }
}
