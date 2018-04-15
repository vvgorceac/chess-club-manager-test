package pageobjects;

import net.thucydides.core.annotations.WhenPageOpens;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;

public class TournamentDetailPage extends BasePage {
    Logger logger = LoggerFactory.getLogger(TournamentDetailPage.class);

    @WhenPageOpens
    public void waitUntilNavBarAppears() {
        logger.info("Wait Until Navigation bar appears");
        $("//div[@class=\"navbar navbar-inverse navbar-fixed-top\"]").waitUntilVisible();
    }
}
