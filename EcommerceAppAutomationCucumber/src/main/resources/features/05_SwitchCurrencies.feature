@regression
Feature: user should be able to switch currencies

  Background: user open the browser and go to login page
    Given user navigates to login page
    And user enter valid username and password and click login


  Scenario: user change the currency

    When user click on euro currency
    Then user changed the currency successfully

