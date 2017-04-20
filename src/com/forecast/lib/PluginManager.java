package com.forecast.lib;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zachary on 3/22/2017.
 */
public class PluginManager {

    private List<PluginStub> plugins = new ArrayList<>();

    private GsonBuilder gsonBuilder = new GsonBuilder();
    private Gson gson;

    public PluginManager() {
        gsonBuilder.setPrettyPrinting();
        gson = gsonBuilder.create();
    }

    public void registerPlugin(final File pluginFile) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        final URL[] urls = new URL[]{pluginFile.toURI().toURL()};
        final URLClassLoader classLoader = new URLClassLoader(urls);
        final InputStreamReader reader = new InputStreamReader(classLoader.getResourceAsStream("plugin.cfg"));
        final PluginInfo pluginInfo = gson.fromJson(reader, PluginInfo.class);
        if (isPluginUpToDate(pluginInfo.getId())) {
            final Class pluginClass = classLoader.loadClass(pluginInfo.getMainClass());
            final Plugin pluginObj = (Plugin) pluginClass.getConstructor().newInstance();
            plugins.add(new PluginStub(pluginObj, pluginInfo));
        }

    }

    public List<PluginStub> getPlugins() {
        return plugins;
    }

    public boolean isPluginUpToDate(final String identifier) {
        return true;
    }
}
