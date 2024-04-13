@us12_e2e
Feature: US_12 Assign Lesson
  Scenario: Vice Dean assigns lesson to teacher
    Given User is authorized as "vicedean"
    Then sets the url for getAllUnassignedLessons to find an unassigned lessons
    And sets the Url for assigning the lesson to teacher
    And sets the payload for assigning the lesson to teacher
    When sends POST request and GETS response for assigning lesson
    Then verifies status code is 200 for assigning lesson
    And verifies response body for assigning lesson