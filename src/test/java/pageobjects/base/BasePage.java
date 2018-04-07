package pageobjects.base;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

    @FindBy(xpath = "//a[text()=' Домой']")
    public WebElementFacade homeButton;

    @FindBy(xpath = "//a[text()=' Турниры']")
    public WebElementFacade tournamentsButton;

    @FindBy(xpath = "//a[text()=' Игроки']")
    public WebElementFacade playersButton;

    @FindBy(xpath = "//a[text()=' Новости']")
    public WebElementFacade newsButton;

    @FindBy(xpath = "//a[text()=' Помощь \\ язык ']")
    public WebElementFacade helpButton;

    @FindBy(xpath = "//a[text()=' Вход']")
    public WebElementFacade loginButton;

    @FindBy(xpath = "//a[text()=' Контакты']")
    public WebElementFacade contact;

}
