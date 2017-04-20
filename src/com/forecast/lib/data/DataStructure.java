package com.forecast.lib.data;

import com.forecast.lib.graph.DataAlias;
import com.forecast.lib.graph.DataPoint;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zachary on 3/22/2017.
 */
public abstract class DataStructure {

    private String name;
    private List<String> fileTypes;

    public DataStructure(final String name, final String... fileTypes) {
        this.name = name;
        this.fileTypes = Arrays.asList(fileTypes);
    }

    public abstract List<DataPoint> importData(final File file, final DataAlias xDataAlias, final DataAlias yDataAlias);

    public String getName() {
        return name;
    }

    public List<String> getFileTypes() {
        return fileTypes;
    }
}
