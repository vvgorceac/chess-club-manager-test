package pageobjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;
import pageobjects.wrappers.Grid;

@DefaultUrl("/")
public class HomePage extends BasePage {

    Logger logger = LoggerFactory.getLogger(HomePage.class);

    @FindBy(xpath = ".//a[./i[@class=\"fa fa-wrench\"]]")
    public WebElement manageButton;

    @FindBy(xpath = ".//a[@href=\"/ManagePlayers\"]")
    public WebElement managePlayerButton;


    @WhenPageOpens
    public void waitUntilNavBarAppears() {
        logger.info("Wait Until Navigation bar appears");
        $("//div[@class=\"navbar navbar-inverse navbar-fixed-top\"]").waitUntilVisible();
    }


    public Grid findGrid(String name) {
        logger.info("Looking for a grid " + name);
        return new Grid($(".//table[@id=\"" + name + "\"]"));
    }

    public int getRowsCountForGrid(String name) {
        int i = this.findGrid(name).getRowsCount();
        logger.info("Get Rows Cound For Grid = " + i);
        return i;
    }

    public void openManagePlayerPage() {
        this.manageButton.click();
        this.managePlayerButton.click();
    }


}


