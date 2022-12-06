package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage=new LoginPage();

    @Test
    public void verifyUserShouldDNavigateToLoginPageSuccessfully(){
        loginPage.clickOnSignInLink();
        Assert.assertEquals(loginPage.verifyWelcomeBackText(),"Welcome Back!","User is not navigated successfully");
    }
@Test
    public void VerifyUserShouldNotLoginWithInvalidDataAndVerifyErrorMessage(){
        loginPage.clickOnSignInLink();
        loginPage.enterEmailAddress("Admin123@gmail.com");
        loginPage.enterPassword("abc123");
        loginPage.clickOnSigninButton();
        //Verify  error message
    Assert.assertEquals(loginPage.verifyInvalidEmailOrPasswordMessage(),"Invalid email or password.");

}




}
