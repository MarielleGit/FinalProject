@US_11_api @dimitris_api
Feature: US_11 Vice Deans should be able to view the lesson schedule and make updates
  Background: Login as an Vice Dean
    Given User is authorized as "vicedean"

  Scenario: Vice Dean should be able to see Lessons Program
    Given Vice Dean sends GetAll request For Lessons Program
    And vice dean gets the lesson program and assert
    And User sends delete request for lesson program
    Then verifies status code is 200 for deleted program lesson

