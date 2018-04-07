package actions;

import net.thucydides.core.annotations.Step;
import pageobjects.HomePage;

public class HomeActions {
    HomePage homePage;

    @Step
    public void openHomePage() {
        homePage.open();
    }
}
