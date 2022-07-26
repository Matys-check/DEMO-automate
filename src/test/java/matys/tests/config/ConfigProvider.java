package matys.tests.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider  {
    private static final String PROPERTIES_DIR = "src/test/resources/properties/";

    public static final ConfigProperties CONFIG_PROPERTIES;

    static {
        ConfigFactory.setProperty("test.properties.path", PROPERTIES_DIR + "test.properties");
        CONFIG_PROPERTIES = ConfigFactory.create(ConfigProperties.class, System.getProperties());
    }
}
