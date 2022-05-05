@regression
Feature: user should be able to select a category

  Background: user open the browser and go to login page
    Given user navigates to login page
    And user enter valid username and password and click login


  Scenario: user select the category

    When user select a category from the categories bar
    Then user selected the category successfully

