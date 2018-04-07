package stepdefinitions;


import net.thucydides.core.annotations.Step;
import pageobjects.MainPage;

public class MainPageSteps {
    MainPage mainPage;

    @Step
    public void openMainPage() {
        mainPage.open();
    }
}
