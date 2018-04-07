package stepdefinitions;

import actions.HomeActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.HomePage;
import pageobjects.base.BasePage;

import java.lang.reflect.Method;
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

    @Given("I am on '(.*)'")
    public void iAmOnPage(String param) throws Throwable {
        switch (param){
            case "homePage": homePage.open();
        }
    }

    @Then("I see '(.*)' of '(.*)' is displayed")
    public void iSeeButton(String button, String page) throws Throwable {
        BasePage basePage = null;
        switch (page){
            case "homePage": basePage = homePage;
        }

        switch (button){
            case "homeButton" : assert (basePage.homeButton.isDisplayed());
            case "tournamentsButton": assert (basePage.tournamentsButton.isDisplayed());
            case "playersButton": assert (basePage.playersButton.isDisplayed());
        }
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
