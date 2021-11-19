@Regression
Feature: Calculate Mortgage Payment

  Background:
    Given verify landing page display

  @CalMortgageSpecificData
  @One
  Scenario: Calculate mortgage payment with specific data
    Given user enter Mortgage Amount "dollar" and "800000"
    And user enter Amortization Period "35" and "12"
    And user enter Interest Term "40" and "12"
    And user choose Interest Type "Fixed"
    And user choose Interest Rate "2.6"
    And user enter Start Date "3" and "2022"
    And user choose Payment period "Semi-Monthly"
    When user click Calculate Now button
    Then user should see Monthly Payment "$2,853.65"
    And user should see total payments "$1,232,776.82"
    And user should see total interest "$432,776.82"


  @CalMortgagePaymentWithSetOfData
  Scenario Outline: Calculate mortgage payment with Set of data
    Given user enter Mortgage Amount "<MortgageAmountCurrency>" and "<MortgageAmount>"
    And user enter Amortization Period "<AmortizationPeriodYears>" and "<AmortizationPeriodMonths>"
    And user enter Interest Term "<InterestTermYears>" and "<InterestTermMonths>"
    And user choose Interest Type "<InterestType>"
    And user choose Interest Rate "<InterestRate>"
    And user enter Start Date "<StartDateMonth>" and "<StartDateYear>"
    And user choose Payment period "<PaymentPeriod>"
    When user click Calculate Now button
    Then user should see Monthly Payment "<ExpectedMonthlyPayment>"
    And user should see total payments "<ExpectedTotalPayments>"
    And user should see total interest "<ExpectedTotalInterest>"


    Examples:
      | MortgageAmountCurrency | MortgageAmount | AmortizationPeriodYears | AmortizationPeriodMonths | InterestTermYears | InterestTermMonths | InterestType | InterestRate | StartDateMonth | StartDateYear | PaymentPeriod | ExpectedMonthlyPayment | ExpectedTotalPayments | ExpectedTotalInterest |
      | dollar                 | 500000         | 35                      | 12                       | 40                | 12                 | Fixed        | 1.7          | 3              | 2022          | Monthly       | $1,548.27              | $668,852.68           | $168,852.68           |
      | euro                   | 600000         | 40                      | 11                       | 36                | 11                 | Variable     | 2.6          | 5              | 2023          | Semi-Monthly  | €1,981.55              | €973,021.78           | €373,021.78           |
      | pound                  | 800000         | 28                      | 9                        | 48                | 8                  | Fixed        | 3.8          | 8              | 2022          | Bi-Weekly     | £3,815.01              | £1,316,178.66         | £516,178.66           |
      | dollar                 | 850000         | 30                      | 5                        | 60                | 3                  | Variable     | 4            | 10             | 2024          | Weekly        | $4,012.89              | $1,464,864.41         | $614,864.41           |
      | dollar                 | 950000         | 22                      | 8                        | 30                | 9                  | Fixed        | 6.4          | 2              | 2025          | Acc-Weekly    | $6,625.43              | $1,802,380.77         | $852,380.77           |


