Feature: User Login
  User should be able to login using valid credentials


  Scenario: Testing login with valid credentials
    Given I am on login page
    When I enter username as "xyz" and password as "demo"