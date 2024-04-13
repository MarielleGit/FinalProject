@US_21_db
Feature: Student Creation Validation DB
  Scenario: User Validates Created lesson From DB
    Given User sets connection
    And User creates statement
    When User executes query for created lesson
    Then validates result set
    And User terminates connection