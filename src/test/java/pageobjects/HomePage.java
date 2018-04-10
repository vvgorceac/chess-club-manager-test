package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.base.BasePage;
import wrappers.Grid;

@DefaultUrl("/")
public class HomePage extends BasePage {

    Logger logger = LoggerFactory.getLogger(HomePage.class);


    @WhenPageOpens
    public void waitUntilNavBarAppears() {
        logger.info("Wait Until Navigation bar appears");
        $("//div[@class=\"navbar navbar-inverse navbar-fixed-top\"]").waitUntilVisible();
    }


    public Grid findGrid(String name) {
        logger.info("Looking for a grid " + name);
        return new Grid($(".//table[@id=\"" + name + "\"]"));
    }

    public int getRowsCountForGrid(String name) {
        int i = this.findGrid(name).getRowsCount();
        logger.info("Get Rows Cound For Grid = " + i);
        return i;
    }


}


