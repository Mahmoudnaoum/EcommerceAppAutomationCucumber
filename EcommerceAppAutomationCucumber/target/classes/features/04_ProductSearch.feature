@regression
Feature: user should be able to search for a product

  Background: user open the browser and go to login page
    Given user navigates to login page
    And user enter valid username and password and click login


  Scenario: user enters the product name and click search

    When user enter product name in the search field
    And user click on search button
    Then user searched for the product successfully

