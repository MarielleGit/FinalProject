@us02_api
Feature: US_02
  Background: Login as an
    Given User is authorized as "Admin"


  Scenario: user register on page
    And User sets the Url for guest User
    And sets the payload for guest User
    When sends POST request and get response for guest user
    Then verifies status code is 200 for guest user
    And verifies response body guest user

  Scenario: User deletes created guest user list
    Given user gets the id by using getAll
    When User delete guest user list By id



#  @us02_api
#  Feature: US_02
#  Background: Login as an
#    Given User is authorized as "Admin"
#  Scenario: User deletes created guest user list
#    Then user gets the id by using getAll
#    When User delete guest user list By id





