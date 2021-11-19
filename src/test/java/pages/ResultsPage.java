package pages;

import library.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;

public class ResultsPage extends Driver {

    public void monthlyPayment(String monthlyPayment) {
        myLibrary.waitForElementVisibility((By.cssSelector("input#summaryMonthly")));
        myLibrary.waitForElementVisibility((By.cssSelector(".resultBox ul")));

        WebElement monthlyPaymentText = driver.findElement(By.cssSelector("input#summaryMonthly"));
        String ActualMonthlyPayment = monthlyPaymentText.getAttribute("value");
        System.out.println("\n" + "Actual monthly payment is: " + ActualMonthlyPayment + "\n" + "Expected Monthly Payment is : " + monthlyPayment);
        assertThat(ActualMonthlyPayment, equalToIgnoringWhiteSpace(monthlyPayment));
    }

    public void totalPayments(String totalPay) {
        WebElement ActualTotalPayment = driver.findElement(By.cssSelector("input#summaryTotal"));
        String ActualTotalPaymentText = ActualTotalPayment.getAttribute("value");
        System.out.println("\n" +"Actual total payment is: " + ActualTotalPaymentText + "\n" + "Expected total Payment is : " + totalPay);
        assertThat(ActualTotalPaymentText, equalToIgnoringWhiteSpace(totalPay));
    }

    public void totalInterest(String totalPays) {
        WebElement totalInt = driver.findElement(By.cssSelector("input#summaryInterest"));
        String ActualTotalInterestText = totalInt.getAttribute("value");
        System.out.println("\n" +"Actual total Interest is: " + ActualTotalInterestText + "\n" + "Expected total Interest is : " + totalPays);
        assertThat(ActualTotalInterestText, equalToIgnoringWhiteSpace(totalPays));

    }

}
