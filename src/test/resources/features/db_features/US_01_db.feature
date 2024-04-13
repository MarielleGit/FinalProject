
@db01 @api_db
Feature: Verify guest User

  Scenario: User Register guest user list validation
    Given User sets connection for guest user
    And User creates statement for guest user
    When User executes query for created email
    Then user validates result set for guest user
    And User terminates connection for guest user