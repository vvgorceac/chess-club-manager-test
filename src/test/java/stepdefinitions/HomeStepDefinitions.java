package stepdefinitions;

import actions.HomeActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.HomePage;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;


public class HomeStepDefinitions {
    Logger logger = LoggerFactory.getLogger(HomeStepDefinitions.class);

    HomePage homePage;

    @Steps
    HomeActions homeActions;

    @Given("I am on main page")
    public void iAmOnMainPage() throws Throwable {
        homeActions.openHomePage();
    }

    @Then("I see '(.*)' tournament table")
    public void iSeeCurrentTournamentTable(String param) throws Throwable {
        Assert.assertTrue(homePage.findGrid(param).isDisplayed());
    }


    @Then("I see for '(.*)' tournament table rows count is less or equal to 5")
    public void iSeeForTournamentTableRowsCountIsLessOrEqualToFive(String param) throws Throwable {
        Assert.assertTrue(homePage.getRowsCountForGrid(param) <= 5);
    }

    @Then("I see for '(.*)' tournament table corresponding columns")
    public void iSeeForTournamentTableCorrespondingColumns(String param, DataTable columns) throws Throwable {
        List<String> expected =  columns.asList(String.class);
        logger.info("Expecting to see " + expected);
        Assert.assertThat(homePage.findGrid(param).getHeaderColumns(), is(expected));
    }
}
