package runner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.Login;

class Login_Test {

    @Test
    void login() {
        var login = new Login();
        Assertions.assertTrue(login.loginSucessful());
    }
}
