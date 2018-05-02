package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;
import wrappers.Grid;

@DefaultUrl("/Tournaments")
public class TournamentsPage extends BasePage {

    Logger logger = LoggerFactory.getLogger(TournamentsPage.class);

    @FindBy(xpath = ".//h2")
    WebElementFacade tournamentsLabel;

    public Grid getGrid() {
        return new Grid($(".//table"));
    }


    public void openTournament(int rowIndex) throws InterruptedException {
        int colIndex = 12;
        logger.info("Opening Tournament");
        this.getGrid().getCell(rowIndex, colIndex).findElement(By.xpath(".//a")).click();
    }

}
