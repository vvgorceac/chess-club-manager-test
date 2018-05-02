package support;

import java.util.Properties;

public class ConfigsLoader {

    public static final ConfigsLoader instance = new ConfigsLoader();

    private Properties configFile;

    private ConfigsLoader() {
        configFile = new java.util.Properties();
        try {
            configFile.load(this.getClass().getClassLoader().
                    getResourceAsStream("support/config.properties"));
        } catch (Exception eta) {
            eta.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return this.configFile.getProperty(key);
    }

}
