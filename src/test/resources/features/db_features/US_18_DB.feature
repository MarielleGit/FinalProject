@us_18_db
Feature: student info update Validation
  Scenario: teacher validates updated student info
    When teacher sets connection US_18
    And teacher creates statement US_18
    And teacher executes query for created meet US_18
    Then teacher validates result set US_18
    And teacher terminates connection US_18