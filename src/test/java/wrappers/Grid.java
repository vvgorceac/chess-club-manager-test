package wrappers;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wrappers.base.BaseWrapper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Grid {

    Logger logger = LoggerFactory.getLogger(Grid.class);

    private final WebElement tableElement;

    public Grid(final WebElement tableElement) {
        this.tableElement = tableElement;
    }

    public boolean isDisplayed() {
        return this.tableElement.isDisplayed();
    }


    public List<String> getHeaderColumns() {
        List<WebElement> list = tableElement.findElements(By.xpath(".//thead//th"));
        List<String> ar = new LinkedList<String>();
        for (WebElement el : list) {
            ar.add(el.getText());
        }
        logger.info("Found Headers " + ar);
        return ar;
    }

    public int getRowsCount() {
        WebElement locatorT = tableElement;

        List<WebElement> list = locatorT.findElements(By.xpath(".//tbody//tr[not(.//a/i)]"));

        int i = list.size();
        logger.info("Get Rows Cound For Grid = " + i);
        return i;
    }


}
