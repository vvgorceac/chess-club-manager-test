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

    public WebElement getCell(int rowIndex, int colIndex) {
        logger.info("Searching for a cell row:" + rowIndex + " col:" + colIndex);
        WebElement el = this.tableElement.findElement(By.xpath("//tbody//tr[" + rowIndex + "]/td[" + colIndex + "]"));
        logger.info("Cell was found");
        return el;
    }


}
