@regression
Feature: user should be able to filter products by tag

  Background: user open the browser and go to login page
    Given user navigates to login page
    And user enter valid username and password and click login
    And user select a category from the categories bar


  Scenario: user select (awesome) tag for the products

    When user customize select awesome tag
    Then user filtered the products successfully with awesome tag

