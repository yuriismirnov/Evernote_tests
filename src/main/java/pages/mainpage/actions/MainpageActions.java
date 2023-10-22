package pages.mainpage.actions;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.mainpage.locators.MainpageLocators;

public class MainpageActions extends MainpageLocators {

    @Step
    public void userAccountLabelIsVisible() {
        userAccountLabel.shouldBe(Condition.visible);
        CustomLogger.logger.info("Ok");
    }

    @Step
    public void userAccountLabelClick() {
        userAccountLabel.click();
        logoutLabel.click();
        CustomLogger.logger.info("Ok");
    }

    @Step
    public void createNewNote() {
        createNewNote.click();
        headerNotesTitle.shouldBe(Condition.visible);
        CustomLogger.logger.info("Ok");
    }

    @Step
    public void logoutFromProfile() {

    }

    @Step
    public void fillSomeTextIntoNote() {

    }
}
