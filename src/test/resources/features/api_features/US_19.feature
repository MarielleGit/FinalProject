@us19_api
Feature: US_19 Teacher should be able to add meetings with students
  Scenario: Teacher adds meetings with students
    Given User is authorized as "teacher"
    And sets the Url for creating meeting with students
    And sets the payload to create meeting with students
    When sends POST request and GETS response for creating meetings
    Then verifies status code is 200 for creating meeting
    Then verifies response body for creating meeting
