package ng.plugins.com;

import ng.plugins.com.plugin.NgCore;
import ng.plugins.com.utils.logger.Logger;
import ng.plugins.com.utils.logger.LoggerType;

public class Core extends NgCore {

    private static Core Instance;

    public static Core getInstance(){
        return Instance;
    }
    @Override
    public void load() {

    }

    @Override
    public void enable() {
        Logger.cl(LoggerType.ON, "Plugin iniciado.");
    }

    @Override
    public void disable() {
        Logger.cl(LoggerType.OFF, "Plugin desativado.");
    }
}
