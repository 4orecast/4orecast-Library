package com.forecast.lib.graph;

import java.io.Serializable;

/**
 * Created by Zachary on 4/3/2017.
 */
public class DataPoint implements Serializable {

    private DataAliasStub posX, posY;


    public DataPoint(final DataAliasStub posX, final DataAliasStub posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public DataAliasStub getPosX() {
        return posX;
    }

    public DataAliasStub getPosY() {
        return posY;
    }
}
