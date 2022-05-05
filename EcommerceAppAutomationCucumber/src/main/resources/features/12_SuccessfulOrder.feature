@regression
Feature: user should be able to make a successful order

  Background: user open the browser and go to login page
    Given user navigates to login page
    And user enter valid username and password and click login
    And user select books category from the categories bar


  Scenario: user add the product to the cart and order it

    When user click on the add to cart button under the first product
    And user click the cart
    And user enter the terms of services
    And user click on checkout button
    And user enter the billing address
    And user enter the shipping method
    And user enter the payment info
    And user confirms the order
    Then user made a successful order

