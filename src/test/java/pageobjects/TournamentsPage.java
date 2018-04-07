package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;
import wrappers.Grid;

@DefaultUrl("/Tournaments")
public class TournamentsPage extends BasePage {

    Logger logger = LoggerFactory.getLogger(TournamentsPage.class);

    @FindBy(xpath = ".//h2")
    WebElementFacade tournamentsLabel;

    public Grid grid = new Grid($(".//table"));


}
