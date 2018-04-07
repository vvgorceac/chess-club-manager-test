package wrappers;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wrappers.base.BaseWrapper;

import java.util.LinkedList;
import java.util.List;

public class Grid extends BaseWrapper {

    Logger logger = LoggerFactory.getLogger(Grid.class);

    public Grid(String xpath, WebDriver driver){
        super(xpath, driver);
    }

    public List<String> getHeaderColumns() {
        List<WebElement> list = locator.findElements(By.xpath(".//thead//th"));
        List<String> ar = new LinkedList<String>();
        for (WebElement el : list) {
            ar.add(el.getText());
        }
        logger.info("Found Headers " + ar);
        return ar;
    }

    public int getRowsCount() {
        WebElement locatorT = locator;

         List<WebElement> list = locatorT.findElements(By.xpath(".//tbody//tr[not(.//a/i)]"));

        int i = list.size();
        logger.info("Get Rows Cound For Grid = " + i);
        return i;
    }





}
