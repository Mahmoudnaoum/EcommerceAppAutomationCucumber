@regression
Feature: user should be able to filter products

  Background: user open the browser and go to login page
    Given user navigates to login page
    And user enter valid username and password and click login
    And user select notebook category from the categories bar


  Scenario: user filter the products

    When user customize the product's filter from the left
    Then user filtered the products successfully

