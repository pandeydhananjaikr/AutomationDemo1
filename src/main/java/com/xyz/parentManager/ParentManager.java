package com.xyz.parentManager;

import com.xyz.managers.DriverManager;
import com.xyz.managers.PageManager;
public class ParentManager {
    private DriverManager driverManager;
    private PageManager pageManager;

    public ParentManager() {
        driverManager = new DriverManager();
        pageManager = new PageManager(driverManager.getDriverForLaunch());
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }

    public PageManager getPageManager() {
        return pageManager;
    }
}
