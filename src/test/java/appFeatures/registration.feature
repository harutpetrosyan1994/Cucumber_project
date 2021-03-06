@UserRegistration
Feature: User Registration
  Scenario: user registration with different data with columns
    Given User is on registration page
    When  User enters following user details with columns
      | firstname | lastname   | email          | phone | city      |
      | naveen    | automation | nav@gmail.com  | 99999 | Bangalore |
      | tom       | peter      | tom@gmail.com  | 99999 | London    |
      | lisa      | dzouza     | lisa@gmail.com | 99999 | SFO       |
    Then user registration should be successful

  Scenario: user registration with different data
    Given User is on registration page
    When  User enters following user details
      | naveen | automation | nav@gmail.com  | 99999 | Bangalore |
      | tom    | peter      | tom@gmail.com  | 99999 | London    |
      | lisa   | dzouza     | lisa@gmail.com | 99999 | SFO       |
    Then user registration should be successful
