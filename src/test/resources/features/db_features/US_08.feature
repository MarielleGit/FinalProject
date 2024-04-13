Feature: Dean Creation Validation DB
  Scenario: User Validates Created Dean From DB
    Given User Set connection for vice dean
    And User creates statement for lesson
    When User execute query for lessons
    Then validates result set for lessons
    And User terminate connection for lessons