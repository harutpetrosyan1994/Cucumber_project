Feature: Home Page
  In order to check my order details
  As a registered user
  I want to specify the feature of order details page
  Background:
    Given  a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page
  Scenario:Check Previous order Details
    When user click on Order link
    Then user checks the Previous order details
  Scenario:Check Previous Open Order Details
    When user click on Open Order link
    Then user checks the open order details
  Scenario:Check Cancelled Order Details
    When user click on Cancelled Order link
    Then user checks the Cancelled order details