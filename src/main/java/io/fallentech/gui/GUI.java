package io.fallentech.gui;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.service.ServicePriority;

public class GUI extends PluginBase{

    @Override
    public void onEnable() {
        getServer().getServiceManager().register(APIImpl.class, new APIImpl(), this, ServicePriority.NORMAL);
    }
    // todo
    /*
    add support for
    POCKET ui forms
    CLASSIC ui forms
    AUTOMATIC detectaion
     */
}