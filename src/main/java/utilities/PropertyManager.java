package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String baseURL;
    private static String email;
    private static String password;

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
        email = prop.getProperty("email");
        password = prop.getProperty("password");

        //        registration
        firstName = prop.getProperty("firstName");
        lastName = prop.getProperty("lastName");
        reg_email = prop.getProperty("reg_email");
        reg_password = prop.getProperty("reg_password");


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
