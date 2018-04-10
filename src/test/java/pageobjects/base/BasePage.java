package pageobjects.base;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class BasePage extends PageObject {

    @FindBy(xpath = "//a[text()=' Домой']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[text()=' Турниры']")
    public WebElement tournamentsButton;

    @FindBy(xpath = "//a[text()=' Игроки']")
    public WebElement playersButton;

    @FindBy(xpath = "//a[text()=' Новости']")
    public WebElement newsButton;

    @FindBy(xpath = "//a[text()=' Помощь \\ язык ']")
    public WebElement helpButton;

    @FindBy(xpath = "//a[text()=' Вход']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()=' Контакты']")
    public WebElement contact;

}
