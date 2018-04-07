package pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

@DefaultUrl("http://chessclubmanager.somee.com/")
public class MainPage extends PageObject {
    Logger logger = LoggerFactory.getLogger(PageObject.class);

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public void waitUntilNavBarAppears() {
        logger.info("Wait Until Navigation bar appears");
        $("//div[@class=\"navbar navbar-inverse navbar-fixed-top\"]").waitUntilVisible();
    }

    public WebElement findGrid(String name) {
        logger.info("Looking for a grid " + name);
        return $(".//table[@id=\"" + name + "\"]");
    }

    public int getRowsCountForGrid(String name) {
        int i = this.findGrid(name).findElements(By.xpath(".//tbody//tr[not(.//a/i)]")).size();
        logger.info("Get Rows Cound For Grid = " + i);
        return i;
    }

    public List<String> getHeaderColumns(String name) {
        List<WebElement> list = this.findGrid(name).findElements(By.xpath(".//thead//th"));
        List<String> ar = new LinkedList<String>();
        for (WebElement el : list) {
            ar.add(el.getText());
        }
        logger.info("Found Headers " + ar);
        return ar;
    }
}


