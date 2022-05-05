@regression
Feature: user should be able to add a product to the cart

  Background: user open the browser and go to login page
    Given user navigates to login page
    And user enter valid username and password and click login
    And user select books category from the categories bar


  Scenario: user add the first product to the cart

    When user click on the add to cart button under the first product
    Then user added the product to cart successfully

