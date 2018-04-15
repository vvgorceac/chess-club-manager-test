package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class Grid {

    Logger logger = LoggerFactory.getLogger(Grid.class);

    private final WebElement tableElement;

    private final By rowLocator;
    private final By colLocator;
    private final By headerLocator;

    public Grid(final WebElement tableElement) {
        logger.info("CREATING NEW GRID");
        this.tableElement = tableElement;
        this.rowLocator = By.xpath(".//tbody//tr");
        this.colLocator = By.xpath(".//td");
        this.headerLocator = By.xpath(".//thead//th");
    }

    public boolean isDisplayed() {
        return this.tableElement.isDisplayed();
    }


    public List<String> getHeaderColumns() {
        List<WebElement> list = tableElement.findElements(this.headerLocator);
        List<String> ar = new LinkedList<String>();
        for (WebElement el : list) {
            ar.add(el.getText());
        }
        logger.info("Found Headers " + ar);
        return ar;
    }

    public int getRowsCount() {
        WebElement locatorT = tableElement;

        List<WebElement> list = locatorT.findElements(this.rowLocator);

        int i = list.size() - 1; // last row is used for navigation button, so we are not taking it in account
        logger.info("Get Rows Cound For Grid = " + i);
        return i;
    }

    public WebElement getRow(int rowIndex) {
        logger.info("Searching for row with index " + rowIndex);
        List<WebElement> list = this.tableElement.findElements(this.rowLocator);
        return list.get(rowIndex);
    }

    public WebElement getCell(int rowIndex, int colIndex) {
        logger.info("Searching for a cell row:" + rowIndex + " col:" + colIndex);
        WebElement el = this.tableElement.findElement(By.xpath("//tbody//tr[" + rowIndex + "]/td[" + colIndex + "]"));
        logger.info("Cell was found");
        return el;
    }
}
