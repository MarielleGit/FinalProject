@us20_db
Feature: Meet Updating Validation
  Scenario: User validates updated meeting from database
    Given User sets connection US_20
    And User creates statement US_20
    When User executes query for updated meet US_20
    Then User validates result set US_20
    Then User terminates connection US_20
