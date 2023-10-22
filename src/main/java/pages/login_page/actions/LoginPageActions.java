package pages.login_page.actions;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.login_page.locators.LoginPageLocators;

public class LoginPageActions extends LoginPageLocators {


    @Step
    public void inputEmail(String emailText) {
        loginInput.sendKeys(emailText);
        CustomLogger.logger.info("Ok");
    }

    @Step
    public void emailInputIsVisible() {
        loginInput.shouldBe(Condition.visible);
        CustomLogger.logger.info("Ok");
    }

    @Step
    public void clickOnButtonSignIn() {
        continueButton.click();
        CustomLogger.logger.info("Ok");
    }

    @Step
    public void passwordInputIsVisible() {
        passwordInput.shouldBe(Condition.visible);
        CustomLogger.logger.info("Ok");
    }

    @Step
    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
        CustomLogger.logger.info("Ok");
    }

    @Step
    public void incorrectPasswordHint() {
        passwordError.shouldBe(Condition.visible);
        CustomLogger.logger.info("Ok");
    }

}
