@regression
Feature: user should be able to login to the system

  Background: user open the browser and go to login page
    Given user navigates to login page

  Scenario: user login with valid username and password

    When user enter valid username and password and click login

    Then user could login successfully
