package pageobjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;
import pageobjects.wrappers.Grid;

@DefaultUrl("/News")
public class NewsPage extends BasePage {
    public Grid grid = new Grid($(".//table"));
    Logger logger = LoggerFactory.getLogger(NewsPage.class);

//    public NewsPage(WebDriver driver) {
//        super(driver);
//    }


    @WhenPageOpens
    public void waitUntilNavBarAppears() {
        logger.info("Wait Until Navigation bar appears");
        $("//div[@class=\"navbar navbar-inverse navbar-fixed-top\"]").waitUntilVisible();
    }


    public void openNews(int rowIndex) {
        int colIndex = 11;
        this.grid.getCell(rowIndex, colIndex).findElement(By.xpath(".//a")).click();
    }
}
