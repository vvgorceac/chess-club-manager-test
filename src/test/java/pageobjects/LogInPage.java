package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;

@DefaultUrl("/Account/Login")
public class LogInPage extends BasePage {
    Logger logger = LoggerFactory.getLogger(LogInPage.class);

    @WhenPageOpens
    public void waitUntilNavBarAppears() {
        logger.info("Wait Until Navigation bar appears");
        $("//div[@class=\"navbar navbar-inverse navbar-fixed-top\"]").waitUntilVisible();
    }
}
