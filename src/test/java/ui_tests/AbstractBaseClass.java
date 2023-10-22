package ui_tests;

import config.Config;
import pages.homepage.actions.HomepageActions;
import pages.homepage.locators.HomepageLocators;
import pages.login_page.actions.LoginPageActions;
import pages.mainpage.actions.MainpageActions;

public abstract class AbstractBaseClass {
    private final Config config = new Config();
    public HomepageActions homepage = new HomepageActions();
    public LoginPageActions loginPage = new LoginPageActions();
    public MainpageActions mainPage = new MainpageActions();
}
