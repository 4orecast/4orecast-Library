package com.forecast.lib.prediction;

import com.forecast.lib.graph.DataAlias;
import com.forecast.lib.graph.DataPoint;

import java.util.List;

/**
 * Created by Zachary on 3/22/2017.
 */
public abstract class Prediction {
    private String name;

    public Prediction(final String name) {
        this.name = name;
    }


    public DataPoint predict(final DataPoint predictPoint, final DataAlias alias, final List<DataPoint> dataPoints) {
        if (predictPoint.getPosX() == null) {
            return predictPosX(predictPoint, alias, dataPoints);
        }
        return predictPosY(predictPoint, alias, dataPoints);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract DataPoint predictPosX(final DataPoint dataPoint, final DataAlias alias, final List<DataPoint> dataPoints);

    protected abstract DataPoint predictPosY(final DataPoint dataPoint, final DataAlias alias, final List<DataPoint> dataPoints);


}
