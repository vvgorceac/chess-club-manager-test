package pageobjects.pages.manage_player;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/ManagePlayers")
public class ManagePlayerLandingPage {
    @FindBy(xpath = ".//a[@href=\"/ManagePlayers/Create\"]")
    public WebElement addPlayerButton;

    public void openAddNewPlayerPage() {
        this.addPlayerButton.click();
    }
}
