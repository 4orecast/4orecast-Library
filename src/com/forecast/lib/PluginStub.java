package com.forecast.lib;

/**
 * Created by Zachary on 4/3/2017.
 */
public class PluginStub {

    private Plugin plugin;
    private PluginInfo pluginInfo;

    public PluginStub(final Plugin plugin, final PluginInfo pluginInfo) {
        this.plugin = plugin;
        this.pluginInfo = pluginInfo;
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public PluginInfo getPluginInfo() {
        return pluginInfo;
    }
}
