package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;
import wrappers.Grid;

@DefaultUrl("/PlayersPage")
public class PlayersPage extends BasePage {
    Logger logger = LoggerFactory.getLogger(PlayersPage.class);

//    public PlayersPage(WebDriver driver) {
//        super(driver);
//    }

    @WhenPageOpens
    public void waitUntilNavBarAppears() {
        logger.info("Wait Until Navigation bar appears");
        $("//div[@class=\"navbar navbar-inverse navbar-fixed-top\"]").waitUntilVisible();
    }

    public Grid grid = new Grid($(".//table"));

    public void openPlayer(int rowIndex) {
        int colIndex = 11;
        this.grid.getCell(rowIndex, colIndex).findElement(By.xpath(".//a")).click();
    }
}
