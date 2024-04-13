@api_01  @api_db
Feature: US_01 User register on the page

  Background:
    Given User is authorized as "Admin"

  Scenario: user register on page
    And User sets the Url for guest User
    And sets the payload for guest User
    When sends POST request and get response for guest user
    Then verifies status code is 200 for guest user
    And verifies response body guest user


  Scenario: User deletes created guest user
    And User sets the Url for delete guest user By id
    And User deletes the created guest user




