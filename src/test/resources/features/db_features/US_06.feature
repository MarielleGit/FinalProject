Feature: Dean Creation Validation DB
  Scenario: User Validates Created Dean From DB
    Given User Set connection for US_06
    And User creates statement for US_06
    When User execute query for created vice dean for US_06
    Then validates result set for US_06
    And User terminate connection for US_06