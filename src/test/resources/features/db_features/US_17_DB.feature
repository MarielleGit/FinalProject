@us_17_db
Feature: student info creation Validation
  Scenario: teacher validates student info
    When teacher sets connection US_17
    And teacher creates statement US_17
    And teacher executes query for created meet US_17
    Then teacher validates result set US_17
    And teacher terminates connection US_17