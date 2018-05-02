package pageobjects.pages.manage_player;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/ManagePlayers/Create")
public class ManageNewPlayerPage {

    @FindBy(xpath = ".//input[@id=\"FirstName\"]")
    public WebElement firstNameInput;

    @FindBy(xpath = ".//input[@id=\"LastName\"]")
    public WebElement lastNameInput;

    @FindBy(xpath = ".//input[@id=\"UserName\"]")
    public WebElement userNameInput;

    @FindBy(xpath = ".//input[@id=\"BirthDay\"]")
    public WebElement birthDayInput;

    @FindBy(xpath = ".//input[@id=\"Email\"]")
    public WebElement emailInput;

    @FindBy(xpath = ".//input[@id=\"PhoneNumber\"]")
    public WebElement phoneNumberInput;

    @FindBy(xpath = ".//textarea[@id=\"Info\"]")
    public WebElement infoInput;




}
