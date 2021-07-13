package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;
import tests_with_login.LogoutTest;
import tests_with_login.PurchaseTestWithLoginTest;

@RunWith(Suite.class)


@Suite.SuiteClasses({
        PurchaseAsGuestTest.class,
        RegistrationTest.class,
        FailedLoginTest.class,
        LoginTest.class,
        LogoutTest.class,
        PurchaseTestWithLoginTest.class
})

public class TestSuites {
}
