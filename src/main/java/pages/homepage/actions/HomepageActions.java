package pages.homepage.actions;

import logger.CustomLogger;
import pages.homepage.locators.HomepageLocators;
import io.qameta.allure.Step;

public class HomepageActions extends HomepageLocators {

    @Step
    public void clickOnButtonSignIn() {
        loginButton.click();
        CustomLogger.logger.info("Ok");
    }
}
