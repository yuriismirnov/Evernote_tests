package ui_tests.loginTest;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ui_tests.AbstractBaseClass;

import static com.codeborne.selenide.Selenide.open;
public class LoginTest extends AbstractBaseClass {

    private final String websiteUrl = "https://evernote.com/";
    private final String email = "yuriismirnov20@gmail.com";
    private final String incorrectPassword = "ajfhkjasfhjksah123@";
    private final String correctPassword = "Qwerty123@";

    @BeforeMethod
    public void openUrl() {
        open(websiteUrl);
    }

    @Test
    @Description(value = "Test with incorrect password")
    public void unsuccessfulLogin() {
        homepage.clickOnButtonSignIn();
        loginPage.inputEmail(email);
        loginPage.clickOnButtonSignIn();
        loginPage.passwordInputIsVisible();
        loginPage.inputPassword(incorrectPassword);
        loginPage.incorrectPasswordHint();
    }

    @Test
    @Description(value = "Test with incorrect password")
    public void successfulLogin() {
        homepage.clickOnButtonSignIn();
        loginPage.inputEmail(email);
        loginPage.clickOnButtonSignIn();
        loginPage.passwordInputIsVisible();
        loginPage.inputPassword(correctPassword);
        loginPage.clickOnButtonSignIn();
    }
}
