package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.landingPage;

public class landingSteps {

    landingPage mylandingPage = new landingPage();

    @Then("verify landing page display")
    public void verifyLandingPageDisplay() {
        mylandingPage.verifyLandingPage();
    }

    @Given("user enter Mortgage Amount {string} and {string}")
    public void userEnterMortgageAmountAnd(String currencyValue, String mount) {
        mylandingPage.mortgageAmountCurrency(currencyValue);
        mylandingPage.mortgageAmount(mount);
    }

    @And("user enter Amortization Period {string} and {string}")
    public void userEnterAmortizationPeriodAnd(String years, String months) throws InterruptedException {
        mylandingPage.amortizationPeriodYears(years);
        mylandingPage.amortizationPeriodMonths(months);
    }

    @And("user enter Interest Term {string} and {string}")
    public void userEnterInterestTermAnd(String years, String months) throws InterruptedException {
        mylandingPage.interestTermYears(years);
        mylandingPage.interestTermMonths(months);
    }


    @And("user choose Interest Type {string}")
    public void userChooseInterestType(String interestType) {
        mylandingPage.chooseInterestType(interestType);
    }

    @And("user choose Interest Rate {string}")
    public void userChooseInterestRate(String interestRate) {
        mylandingPage.ChooseInterestRate(interestRate);
    }

    @And("user enter Start Date {string} and {string}")
    public void userEnterStartDateAnd(String months, String years) {
        mylandingPage.chooseStartDateMonths(months);
        mylandingPage.chooseStartDateYears(years);
    }

    @And("user choose Payment period {string}")
    public void userChoosePaymentPeriod(String paymentPeriod) {
        mylandingPage.choosePaymentPeriod(paymentPeriod);
    }

    @When("user click Calculate Now button")
    public void userClickCalculateNowButton() {
        mylandingPage.calculateNow();
    }
}
