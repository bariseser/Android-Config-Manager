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

        ConfigManager.getInstance().setString("key", "value");
        ConfigManager.getInstance().setInt("comment_count", 100);
        ConfigManager.getInstance().setBoolean("is_login", true);
        ConfigManager.getInstance().setLong("long", 12345678910L);
        ConfigManager.getInstance().setFloat("float", 9.52f);
    }
}
