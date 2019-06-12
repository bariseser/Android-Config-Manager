# AndroidConfigManager
user-friendly configuration wrapper for Android

[![version](https://img.shields.io/badge/version-1.0.2-green.svg)](https://semver.org)

# Download
AndroidConfigManager is available in jitPack.

# Gradle

**First** Add jitPack repositories in build.gradle(root)

```gradle
allprojects 
{
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

**Second** Add the dependency build.gradle(App)

```gradle
dependencies 
{
    implementation 'com.github.bariseser:AndroidConfigManager:Tag'
}
```

Current Version: [![version](https://img.shields.io/badge/version-1.0.2-green.svg)](https://semver.org)

# Usage

##### initialize ConfigManager

```java
ConfigManager.getInstance().initialize(context, "settings");
```

##### Set/Get Config Items
- AndroidConfigManager has a four getter and setter method. 
- All getter method need to config key and value parameters.
- All setter method need to config key parameter. If you want to return default value when the key doesn't exist, just set second parameter

###### Example

```java
ConfigManager.getInstance().setString("key", "value");
ConfigManager.getInstance().setInt("comment_count", 100); 
ConfigManager.getInstance().setBoolean("is_login", false); 
ConfigManager.getInstance().setLong("long", 12345678910L); 
ConfigManager.getInstance().setFloat("float", 9.52f);
```

```java
ConfigManager.getInstance().getString("key", null);
ConfigManager.getInstance().getInt("comment_count", 0);
ConfigManager.getInstance().getBoolean("is_login", false);
ConfigManager.getInstance().getLong("long", 1234234243124L);
ConfigManager.getInstance().getFloat("float", 0.0f);
```

##### Delete Item
```java
ConfigManager.getInstance().delete('comment_count');
```

##### Clear
```java
ConfigManager.getInstance().clear();
```

### Bugs
If you encounter any problems please feel the free to open an [Issue](https://github.com/bariseser/AndroidConfigManager/issues/new).