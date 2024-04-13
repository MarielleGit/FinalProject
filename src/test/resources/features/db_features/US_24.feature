@db24
Feature: Teacher Creation Validation DB
  Scenario: User Validates Created Teacher From DB
    Given User sets connection teacher
    And User creates statement teacher
    When User executes query for created teacher
    Then validates result set teacher
    And User terminates connection teacher