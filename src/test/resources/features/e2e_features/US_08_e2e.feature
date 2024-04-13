@US_08_E2E
Feature:Vice Deans should be able to create a lesson (Lessons - Add Lesson) (UI)

  Scenario:US_08 Test_Case01 (UI)
    Given admin goes to "https://managementonschools.com" homepage
    And User clicks on Login button right corner of the page
    And User enters a valid Vice Dean User name
    And User enters a valid Vice Dean password
    And User clicks on Login button
    When User clicks on Lessons top center of the page
    And User enters lesson name on Lesson Name field
    And User select compulsory button
    And User enters credit score for lesson on Credit Score field
    And User clicks Submit button
    Then User sees a success message
    And close the browser

  Scenario: Vice dean create lesson (API)
    Given User is authorized as "vice dean" for US_06
    And User sets the Url for lessons Save
    And sets the payload for lessons
    When sends post request and get response for lessons
    Then verifies status code is 200 for created lessons
    And verifies lessons response body

  Scenario: Vice dean gets the information for the created lessons (API)
    Given User is authorized as "vice dean" for US_06
    And User gets id of the lessons with lesson name "CPlus"
    And User sets the Url for Get lessons By id
    And sets the expected data for Get lessons By id
    When sends get request and get response for lesson
    Then verifies status code is 200 for get lessons
    And verifies response body for Get lesson By lesson id

  Scenario: User Validates Created Dean From (DB)
    Given User Set connection for vice dean
    And User creates statement for lesson
    When User execute query for lessons
    Then validates result set for lessons
    And User terminate connection for lessons

  Scenario: Vice dean delete the information for the created lessons (API)
    And User sets the Url for lessons delete
    When sends delete request for lessons
    Then verifies status code is 200 for deleted lessons
