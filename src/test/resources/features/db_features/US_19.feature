@us_19_db
Feature: Meet Creation Validation
  Scenario: User validates created meeting from database
    Given User sets connection US_19
    And User creates statement US_19
    When User executes query for created meet US_19
    Then User validates result set US_19
    Then User terminates connection US_19
