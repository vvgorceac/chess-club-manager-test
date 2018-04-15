package stepdefinitions;

import actions.HomeActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.*;
import pageobjects.base.BasePage;

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
    TournamentDetailPage tournamentDetailPage;
    NewsDetailsPage newsDetailsPage;

    BasePage basePage;

    @Steps
    HomeActions homeActions;

    @Given("I am on main page")
    public void iAmOnMainPage() throws Throwable {
        homeActions.openHomePage();
    }

    @Given("I am on '(.*)'")
    public void iAmOnPage(String param) throws Throwable {
        switch (param) {
            case "homePage":
                homePage.open();
                break;
            case "tournamentsPage":
                tournamentsPage.open();
                break;
            case "playersPage":
                playersPage.open();
                break;
//            case "contactsPage":
//                page = contactsPage;
//                break;
            case "newsPage":
                newsPage.open();
                break;
            case "logInPage":
                logInPage.open();
                break;
            case "tournamentsDetailsPage":
                logger.info("OPENING PAGE");
                tournamentsPage.open();
                logger.info("OPENING TOURNAMENT");
                tournamentsPage.openTournament(2);
                logger.info("TOURNAMENT OPENED");
                break;
            case "playerDetailsPage":
                playersPage.open();
                playersPage.openPlayer(0);
                break;
            case "newsDetailsPage":
                newsPage.open();
                newsPage.openNews(0);
                break;
        }
    }

    @Then("I see '(.*)' of '(.*)' is displayed")
    public void iSeeButton(String button, String page) throws Throwable {
        switch (button) {
            case "clubLogo":
                Assert.assertTrue(basePage.logo.isDisplayed());
                break;
            case "homeButton":
                Assert.assertTrue(basePage.homeButton.isDisplayed());
                break;
            case "tournamentsButton":
                Assert.assertTrue(basePage.tournamentsButton.isDisplayed());
                break;
            case "playersButton":
                Assert.assertTrue(basePage.playersButton.isDisplayed());
                break;
            case "newsButton":
                Assert.assertTrue(basePage.newsButton.isDisplayed());
                break;
            case "changeLanguageMenu":
                Assert.assertTrue(basePage.helpButton.isDisplayed());
                break;
            case "logInButton":
                Assert.assertTrue(basePage.loginButton.isDisplayed());
                break;

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
