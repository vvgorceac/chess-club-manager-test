package stepdefinitions;

import actions.HomeActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;
import pageobjects.pages.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;


public class HomeStepDefinitions {
    Logger logger = LoggerFactory.getLogger(HomeStepDefinitions.class);

    HomePage homePage;
    TournamentsPage tournamentsPage;
    NewsPage newsPage;
    PlayersPage playersPage;
    LogInPage logInPage;
    PlayersDetailsPage playerDetailsPage;
    TournamentsDetailsPage tournamentsDetailsPage;
    NewsDetailsPage newsDetailsPage;

    @Steps
    HomeActions homeActions;

    @Given("I am on main page")
    public void iAmOnMainPage() throws Throwable {
        homeActions.openHomePage();
    }

    @Given("I am on '(.*)'")
    public void iAmOnPage(String param) throws Throwable {
        BasePage page;
        switch (param) {
            case "homePage":
                page = homePage;
                break;
            case "tournamentsPage":
                page = tournamentsPage;
                break;
            case "playersPage":
                page = playersPage;
                break;
//            case "contactsPage":
//                page = contactsPage;
//                break;
            case "newsPage":
                page = newsPage;
                break;
            case "logInPage":
                page = logInPage;
                break;
            case "tournamentsDetailsPage":
                page = tournamentsDetailsPage;
                tournamentsPage.open();
                tournamentsPage.openTournament(0);
                break;
            case "playerDetailsPage":
                page = playerDetailsPage;
                playersPage.open();
                playersPage.openPlayer(0);
                break;
            case "newsDetailsPage":
                page = newsDetailsPage;
                newsPage.open();
                newsPage.openNews(0);
                break;
        }
    }

    @Then("I see '(.*)' of '(.*)' is displayed")
    public void iSeeButton(String button, String page) throws Throwable {
        BasePage basePage = null;
        switch (page) {
            case "homePage":
                basePage = homePage;
        }

        switch (button) {
            case "homeButton":
                assert (basePage.homeButton.isDisplayed());
            case "tournamentsButton":
                assert (basePage.tournamentsButton.isDisplayed());
            case "playersButton":
                assert (basePage.playersButton.isDisplayed());
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
        List<String> expected = columns.asList(String.class);
        logger.info("Expecting to see " + expected);
        Assert.assertThat(homePage.findGrid(param).getHeaderColumns(), is(expected));
    }


}
