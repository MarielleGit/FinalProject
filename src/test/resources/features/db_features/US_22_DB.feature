@db22
Feature: Admin Creation Validation DB
  Scenario: User Validates Created Admin From DB
    Given User sets connection for admin
    And User creates statement for admin
    When User executes query for created admin
    Then validates result set for admin
    And User terminates connection for admin