package config;

import java.util.Map;
import java.util.HashMap;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configurations;

    private ConfigurationManager() {
        configurations = new HashMap<>();
        loadConfigurations();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadConfigurations() {
        configurations.put("maxPlayers", "100");
        configurations.put("defaultLanguage", "en");
        configurations.put("gameDifficulty", "medium");
    }

    public String getConfig(String key) {
        return configurations.get(key);
    }

    public void printAllConfigurations() {
        System.out.println("Configuration Settings:");
        for (Map.Entry<String, String> entry : configurations.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
