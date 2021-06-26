package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)


@Suite.SuiteClasses({
        PurchaseAsGuestTest.class,
        RegistrationTest.class,
        FailedLoginTest.class,
        LoginTest.class,
        LogoutTest.class
})

public class TestSuites {
}
