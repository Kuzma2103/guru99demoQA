package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String baseURL;
    private static String bad_password;

    //    registration
    private static String firstName;
    private static String lastName;
    private static String reg_email;
    private static String reg_password;


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
        bad_password = prop.getProperty("bad_password");

        //        registration
        firstName = prop.getProperty("firstName");
        lastName = prop.getProperty("lastName");
        reg_email = prop.getProperty("reg_email");
        reg_password = prop.getProperty("reg_password");

        return instance;
    }

    public static void setProperty(String key, String value) {

        Properties editProperties = new Properties();

        try {
            FileInputStream fileEdit = new FileInputStream("src/main/resources/configuration.properties");
            editProperties.load(fileEdit);
            editProperties.setProperty(key, value);
            editProperties.store(new FileOutputStream("src/main/resources/configuration.properties"), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getDriverPath() {
        return driverPath;
    }

    public String getURL() {
        return baseURL;
    }

    public String getBad_password() {
        return bad_password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getReg_email() {
        return reg_email;
    }

    public String getReg_password() {
        return reg_password;
    }

}
