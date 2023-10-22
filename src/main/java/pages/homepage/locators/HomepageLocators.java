package pages.homepage.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomepageLocators {
    protected final SelenideElement loginButton = $(byXpath("(//a[@href='https://www.evernote.com/Login.action'])[1]"));
}
