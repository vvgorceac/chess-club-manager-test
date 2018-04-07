package wrappers.base;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseWrapper extends PageObject {

    protected WebElement locator;

    public BaseWrapper(String xpath, WebDriver driver){
        this.locator = driver.findElement(By.xpath(xpath));
    }

    public boolean isDisplayed(){
        return locator.isDisplayed();
    }

}
