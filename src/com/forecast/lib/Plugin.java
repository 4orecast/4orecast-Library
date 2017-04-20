package com.forecast.lib;

import com.forecast.lib.data.DataStructure;
import com.forecast.lib.graph.DataAlias;
import com.forecast.lib.prediction.Prediction;

import java.util.List;

/**
 * Created by Zachary on 3/22/2017.
 */
public interface Plugin {

    List<Prediction> predictions();

    List<DataStructure> dataStructures();

    List<DataAlias> dataAliases();
}
