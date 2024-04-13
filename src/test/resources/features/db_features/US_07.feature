Feature: Dean Creation Validation DB
  Scenario: User Validates Created Dean From DB
    Given User Set connection for contact message for US_07
    And User creates statement for contact message for US_07
    When User execute query for created messages for US_07
    Then validates result set for contact message for US_07
    And User terminate connection for contact message for US_07