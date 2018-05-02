package pageobjects.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;

@DefaultUrl("/Account/Login")
public class LogInPage extends BasePage {
    Logger logger = LoggerFactory.getLogger(LogInPage.class);
    @FindBy(xpath = ".//input[@id=\"EmailOrLogin\"]")
    public WebElement loginInput;

    @FindBy(xpath = ".//input[@id=\"Password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = ".//button[@type=\"submit\"]")
    public WebElement submitButton;

    public void logIn(String login, String pass) {
        logger.info("Loggin In with login:" + login + " pass:" + pass);
        this.loginInput.sendKeys(login);
        this.passwordInput.sendKeys(pass);
        this.submitButton.click();
    }

}
