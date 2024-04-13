@db23
Feature: Vice Dean Creation Validation DB
  Scenario: User Validates Created Vice Dean From DB
    Given User sets connection for vice dean
    And User creates statement for vice dean
    When User executes query for created vice dean
    Then validates result set for vice dean
    And User terminates connection for vice dean