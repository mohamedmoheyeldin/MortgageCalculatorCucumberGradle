package pages;

import library.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;


public class landingPage  extends Driver {

    String expectedTitle = "Mortgage Calculator 2022 - FREE Calculator Tool (ZERO Ads)";
    String expectedHeaderText = "Free Mortgage Calculator Tool";


    public void verifyLandingPage() {
        WebElement logo = driver.findElement(By.cssSelector(".flexContainer > a > img[alt='Mortgage calculator logo']"));
        logo.isDisplayed();
        WebElement headerText = driver.findElement(By.cssSelector(".heading-h1"));
        headerText.isDisplayed();
        headerText.getText();
        assertThat(driver.getTitle(), equalTo(expectedTitle));
        assertThat(headerText.getText(), equalToIgnoringWhiteSpace(expectedHeaderText));
    }

    public void mortgageAmountCurrency(String currencyValue) {
        Select mortgageAmoCur = new Select(driver.findElement(By.id("currency")));
        mortgageAmoCur.selectByValue(currencyValue);
    }

    public void mortgageAmount(String mount) {
        WebElement mortgageAmount = driver.findElement(By.cssSelector("#amount"));
        mortgageAmount.click();
        mortgageAmount.clear();
        mortgageAmount.sendKeys(mount);
        mortgageAmount.sendKeys(Keys.TAB);
    }

    public void amortizationPeriodYears(String years) {
        WebElement amortizationPeriodYear = driver.findElement(By.cssSelector("input#amortizationYears"));
        amortizationPeriodYear.clear();
        amortizationPeriodYear.sendKeys(years);
        amortizationPeriodYear.sendKeys(Keys.TAB);
    }

    public void amortizationPeriodMonths(String months) {
        WebElement amortizationPeriodMonths = driver.findElement(By.cssSelector("input#amortizationMonths"));
        amortizationPeriodMonths.clear();
        amortizationPeriodMonths.sendKeys(months);
        amortizationPeriodMonths.sendKeys(Keys.TAB);
    }


    public void interestTermYears(String years) {
        WebElement interestTermYears = driver.findElement(By.cssSelector("input#interestTermYears"));
        interestTermYears.clear();
        interestTermYears.sendKeys(years);
        interestTermYears.sendKeys(Keys.TAB);
    }

    public void interestTermMonths(String months) {
        WebElement interestTermMonths = driver.findElement(By.cssSelector("input#interestTermMonths"));
        interestTermMonths.clear();
        interestTermMonths.sendKeys(months);
    }

    public void chooseInterestType(String interestType) {
        Select IntType = new Select(driver.findElement(By.cssSelector("select#interestType")));
        IntType.selectByVisibleText(interestType);
    }

    public void ChooseInterestRate(String interestRate) {
        WebElement intRate = driver.findElement(By.cssSelector("input#rate"));
        intRate.click();
        intRate.clear();
        intRate.sendKeys(interestRate);
    }

    public void chooseStartDateMonths(String months) {
        Select startDateMonths = new Select(driver.findElement(By.cssSelector("select#startMonth")));
        startDateMonths.selectByVisibleText(months);
    }

    public void chooseStartDateYears(String years) {
        Select startDateYears = new Select(driver.findElement(By.cssSelector("select#startYear")));
        startDateYears.selectByVisibleText(years);
    }

    public void choosePaymentPeriod(String paymentPeriod) {
        Select payPeriod = new Select(driver.findElement(By.cssSelector("select#paymentMode")));
        payPeriod.selectByVisibleText(paymentPeriod);
    }

    public void calculateNow() {
        driver.findElement(By.cssSelector("input#button")).click();
    }


}