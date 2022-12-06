package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By signInLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']/a");
    By welcomebackText = By.xpath("//h1[@class='page__heading']");

    By emaailfield = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By signInButton = By.xpath("//input[@type='submit']");
    By errorMessage = By.xpath("//li[@class='form-error__list-item']");

    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }

    public String verifyWelcomeBackText() {
        return getTextFromElement(welcomebackText);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(emaailfield, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }
    public void clickOnSigninButton(){
        clickOnElement(signInButton);
    }
    public String verifyInvalidEmailOrPasswordMessage(){
       return getTextFromElement(errorMessage);
    }
}
