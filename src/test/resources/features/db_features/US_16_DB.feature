@us_16_db
Feature: Contact Messages Validation
  Scenario: User validates Contact Messages
    Given User sets connection US_16
    And User creates statement US_16
    When User executes query for created meet US_16
    Then User validates result set US_16
    Then User terminates connection US_16
