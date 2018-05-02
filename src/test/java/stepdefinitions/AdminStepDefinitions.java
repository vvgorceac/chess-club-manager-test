package stepdefinitions;

import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.pages.HomePage;
import pageobjects.pages.LogInPage;
import support.ConfigsLoader;

public class AdminStepDefinitions {
    Logger logger = LoggerFactory.getLogger(AdminStepDefinitions.class);

    HomePage homePage;
    LogInPage loginPage;
    ConfigsLoader configsLoader = ConfigsLoader.instance;

    @Given("I am logged in as an Admin")
    public void iAmLoggedInAsAdmin() throws Throwable {
        homePage.open();
        homePage.loginButton.click();
        logger.info(configsLoader.getProperty("adminLogin") + configsLoader.getProperty("adminPassword"));
        loginPage.logIn(configsLoader.getProperty("adminLogin"), configsLoader.getProperty("adminPassword"));
        Thread.sleep(100000);
    }
}
