package com.vladsiradu.games.firstgameandroid.app;

/**
 * Created by Vlad Scaesteanu on 26.09.2017.
 */

public class AppManager {

    public static AppManager instance;

    private AppManager() {

    }

    public static synchronized AppManager getAppManager() {
        if(instance == null) return new AppManager();
        return instance;
    }
}
