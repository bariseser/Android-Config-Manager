package com.bariseser.config_manager;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

public class ConfigManager {

    private static ConfigManager instance = null;
    public SharedPreferences preferences;
    public SharedPreferences.Editor editor;

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void initialize(Context context, String key) {

        preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        editor = context.getSharedPreferences(key, Context.MODE_PRIVATE).edit();
        editor.apply();
    }

    public void setString(String key, String value) {
        editor.putString(key, value).apply();
    }

    public void setInt(String key, int value) {
        editor.putInt(key, value).apply();
    }

    public void setBoolean(String key, boolean value) {
        editor.putBoolean(key, value).apply();
    }

    public void setLong(String key, long value) {
        editor.putLong(key, value).apply();
    }

    public String getString(String key, String defaultValue) {
        return preferences.getString(key, defaultValue);
    }

    public int getInt(String key, int defaultValue) {
        return preferences.getInt(key, defaultValue);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return preferences.getBoolean(key, defaultValue);
    }

    public long getLong(String key, long defaultValue) {
        return preferences.getLong(key, defaultValue);
    }

    public Map<String, ?> getAll() {
        return preferences.getAll();
    }

}