package com.forecast.lib;

/**
 * Created by Zachary on 4/3/2017.
 */
public class PluginInfo {

    private String id;
    private String name;
    private String author;
    private double version;
    private String mainClass;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }

    public String getMainClass() {
        return mainClass;
    }

    public String getAuthor() {
        return author;
    }
}
