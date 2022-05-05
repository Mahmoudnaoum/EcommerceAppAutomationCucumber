@regression
Feature: user should be able to register to the system

  Background: user open the browser and go to registration page
    Given user navigates to registration page


  Scenario: user registration with valid user data

    When user enter valid user data and click register

    Then user could register successfully
