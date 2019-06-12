package com.bariseser.configmanager_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.bariseser.config_manager.ConfigManager;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "MainActivityLOG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConfigManager.getInstance().initialize(this, "settings");

        ConfigManager.getInstance().setString("username", "Barış Eser");

        Log.d(TAG, ConfigManager.getInstance().getString("username", null));

        Log.d(TAG, ConfigManager.getInstance().getAll().get("username").toString());

    }
}
