package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * @author Mohamed Moheyeldin: 07/2/2021
 */

public class GSeleniumLibrary extends Driver {

    /***
     * This is the Constructor
     *
     * @param _driver
     */
    public GSeleniumLibrary(WebDriver _driver) {
        driver = _driver;
    }

    public WebElement waitForElementVisibility(By by) {
        WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

}