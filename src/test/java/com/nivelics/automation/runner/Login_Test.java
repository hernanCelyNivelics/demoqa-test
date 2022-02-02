package com.nivelics.automation.runner;

import org.testng.annotations.Test;
import pages.Login;

import static org.testng.AssertJUnit.assertTrue;

public class Login_Test {

    @Test
    public void login() {
        var login = new Login();
        assertTrue(login.loginSucessful());
    }
}
