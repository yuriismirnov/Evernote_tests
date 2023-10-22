package ui_tests.notesTest;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ui_tests.AbstractBaseClass;

import static com.codeborne.selenide.Selenide.open;

public class NotesTest extends AbstractBaseClass {
    private final String websiteUrl = "https://evernote.com";
    private final String email = "yuriismirnov20@gmail.com";
    private final String password = "Qwerty123@";

    @BeforeTest
    public void openUrl() {
        open(websiteUrl);
    }

    @Test
    @Description(value = "Test with successful login, creating note and logout")
    public void noteCreateAndLogout () {
        homepage.clickOnButtonSignIn();
        loginPage.inputEmail(email);
        loginPage.clickOnButtonSignIn();
        loginPage.passwordInputIsVisible();
        loginPage.inputPassword(password);
        loginPage.clickOnButtonSignIn();
        mainPage.userAccountLabelIsVisible();
        mainPage.createNewNote();
        mainPage.logoutFromProfile();
        loginPage.emailInputIsVisible();
    }
}
