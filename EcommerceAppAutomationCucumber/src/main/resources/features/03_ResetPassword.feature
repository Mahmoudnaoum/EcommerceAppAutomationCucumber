@regression
Feature: user should be able to reset the password to the system

  Background: user open the browser and go to login page
    Given user navigates to login page
    And user click on reset password button


  Scenario: user reset the password successfully

    When user enter valid email click and click recover

    Then user could recover password successfully
