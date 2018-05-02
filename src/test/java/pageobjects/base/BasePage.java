package pageobjects.base;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class BasePage extends PageObject {

    @FindBy(xpath = ".//a[./i[@class=\"fa fa-home\"]]")
    public WebElement homeButton;

    @FindBy(xpath = ".//a[@href=\"/Tournaments\"]")
    public WebElement tournamentsButton;

    @FindBy(xpath = ".//a[@href=\"/Players\"]")
    public WebElement playersButton;

    @FindBy(xpath = ".//a[@href=\"/News\"]")
    public WebElement newsButton;

    @FindBy(xpath = ".//a[@class=\"dropdown-toggle\" and ./i[@class=\"fa fa-info\"]]")
    public WebElement helpButton;

    @FindBy(xpath = ".//a[@href=\"/Account/Login\"]")
    public WebElement loginButton;

//    @FindBy(xpath = "//a[text()=' Контакты']")
//    public WebElement contact;

}
