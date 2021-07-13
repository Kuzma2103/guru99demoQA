package data;


import com.github.javafaker.Faker;

import java.util.ArrayList;

public class DataCreation {
    public static ArrayList<String> registrationData(ArrayList<String> user) {
        Faker faker = new Faker();

        user.add(faker.name().firstName()); // 0 First name
        user.add(faker.name().lastName()); // 1 Last name
        user.add(faker.internet().emailAddress()); // 2 Email address
        user.add(faker.internet().password()); // 3 Password

        // For purchase as guest
        user.add(faker.address().streetName()); // 4 Address
        user.add(faker.address().city()); // 5 City
        user.add(faker.number().digits(5)); // 6 Zip postal code
        user.add(faker.phoneNumber().cellPhone()); // 7 Phone number

        return user;
    }
}
