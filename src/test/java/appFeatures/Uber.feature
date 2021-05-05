@All
Feature: Uber Booking Feature

  @Smoke
  Scenario: Booking Sedan
    Given User wants to select a car type "sedan" from uber app
    When user select car "sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pas 1000 USD

  @Smoke @Regression
  Scenario: Booking SUV
    Given User wants to select a car type "sedan" from uber app
    When user select car "sedan" and pick up point "Bangalore" and drop location "Hyberabad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pas 1000 USD

  @Prod
  Scenario: Booking Mini
    Given User wants to select a car type "sedan" from uber app
    When user select car "sedan" and pick up point "Bangalore" and drop location "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pas 1000 USD