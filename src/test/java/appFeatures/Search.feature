@All
Feature: Amazon Search

  @Smoke
  Scenario: Search a Product Macbook Air
    Given I Have a search field on Amazon Page
    When  I search for a product with name "Apple MacBook PRO" and Price 200
    Then  Product with name "Apple MacBook PRO" should be displayed

  @Regression
  Scenario: Search a Product Iphone
    Given I Have a search field on Amazon Page
    When  I search for a product with name "Iphone" and Price 1200
    Then  Product with name "Iphone" should be displayed