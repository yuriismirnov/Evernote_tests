package pages.mainpage.locators;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainpageLocators {
    protected final SelenideElement userAccountLabel = $(byXpath("//div[@id='qa-NAV_USER']"));
    protected final SelenideElement createNewNote = $(byXpath("//div[@id='qa-HOME_NOTE_WIDGET_CREATE_NOTE']"));
    protected final SelenideElement headerNotesTitle = $(byXpath("qa-NOTES_HEADER"));
    protected final SelenideElement logoutLabel = $(byXpath("//a[@id='qa-ACCOUNT_DROPDOWN_LOGOUT']"));
}
