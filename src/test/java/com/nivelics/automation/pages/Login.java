package com.nivelics.automation.pages;

import com.nivelics.automation.commons.Base;

public class Login extends Base {

    private static final String username_locator = "//input[@id='userName']";
    private static final String password_locator = "//input[@id='password']";
    private static final String buttonLogin_locator = "//button[@id='login']";
    private static final String loginSucessfull_locator = "//button[contains(text(),'Log out')]";

    public Login() {
        super(driver);
    }

    public void navigateToDemoqa() {
        navigateToDemoqa("https://demoqa.com/login");
    }

    public void writeUsername(String locator, String username) {
        write(locator, username);
    }

    public void writePassword(String locator, String password) {
        write(locator, password);
    }

    public Boolean loginSucessful() {
        navigateToDemoqa();
        writeUsername(username_locator, "hernan.cely");
        writePassword(password_locator, "Ct2010**");
        clickElement(buttonLogin_locator);
        return verifyLogin(loginSucessfull_locator);
    }

    public boolean verifyLogin(String locator) {
        try {
            find(locator);
            return true;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }
}

