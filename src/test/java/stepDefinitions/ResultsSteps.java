package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ResultsPage;

public class ResultsSteps {
    ResultsPage myResultsPage = new ResultsPage();

    @Then("user should see Monthly Payment {string}")
    public void userShouldSeeMonthlyPayment(String monthlyPayment) throws InterruptedException {
        myResultsPage.monthlyPayment(monthlyPayment);
    }

    @And("user should see total payments {string}")
    public void userShouldSeeTotalPayments(String totalPayments) {
        myResultsPage.totalPayments(totalPayments);
    }

    @And("user should see total interest {string}")
    public void userShouldSeeTotalInterest(String totalInterest) throws InterruptedException {
        myResultsPage.totalInterest(totalInterest);

    }
}
