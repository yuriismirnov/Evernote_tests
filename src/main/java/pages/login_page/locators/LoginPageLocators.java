package pages.login_page.locators;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageLocators {
    protected final SelenideElement loginInput = $(byXpath("//input[@name='username']"));
    protected final SelenideElement continueButton = $(byXpath("//input[@type='submit']"));
    protected final SelenideElement passwordInput = $(byXpath("//input[@type='password']"));
    protected final SelenideElement passwordError = $(byXpath("//div[text()='Incorrect password.']"));
}
