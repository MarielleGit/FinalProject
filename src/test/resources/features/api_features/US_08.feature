
Feature: US_08 Vice Dean creates lesson
  Scenario: Vice dean create lesson
    Given User is authorized as "vice dean" for US_06
    And User sets the Url for lessons Save
    And sets the payload for lessons
    When sends post request and get response for lessons
    Then verifies status code is 200 for created lessons
    And verifies lessons response body

  Scenario: Vice dean gets the information for the created lessons
    Given User is authorized as "vice dean" for US_06
    And User gets id of the lessons with lesson name "CPlus"
    And User sets the Url for Get lessons By id
    And sets the expected data for Get lessons By id
    When sends get request and get response for lesson
    Then verifies status code is 200 for get lessons
    And verifies response body for Get lesson By lesson id

  Scenario: Vice dean delete the information for the created lessons
    And User sets the Url for lessons delete
    When sends delete request for lessons
    Then verifies status code is 200 for deleted lessons


