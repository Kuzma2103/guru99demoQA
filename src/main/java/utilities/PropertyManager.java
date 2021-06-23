package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String baseURL;
    private static String email;
    private static String password;

    public static PropertyManager getInstance() {
        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            prop.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driverPath = prop.getProperty("driverPath");
        baseURL = prop.getProperty("baseURL");
        email = prop.getProperty("email");
        password = prop.getProperty("password");


        return instance;
    }

    public String getDriverPath() {
        return driverPath;
    }

    public String getURL() {
        return baseURL;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
