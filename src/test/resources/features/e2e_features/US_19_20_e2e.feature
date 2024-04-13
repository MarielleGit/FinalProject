@us19_20_e2e
Feature: US_19_20 Teacher should be able to create update and delete meetings with students
  Scenario: Teacher adds meetings with students
    Given User is authorized as "teacher"
    And sets the Url for creating meeting with students
    And sets the payload to create meeting with students
    When sends POST request and GETS response for creating meetings
    Then verifies status code is 200 for creating meeting
    Then verifies response body for creating meeting

  Scenario: User validates created meeting from database
    Given User sets connection US_19
    And User creates statement US_19
    When User executes query for created meet US_19
    Then User validates result set US_19
    Then User terminates connection US_19
  Scenario: Teacher updates the meetings
    Given User is authorized as "admin"
    When gets id of the created meeting
    And sets the Url for updating meeting with students
    And sets the expected data to update the meeting
    And updates the meeting with id
    Then verifies response body for updating meeting

  Scenario: User validates updated meeting from database
    Given User sets connection US_20
    And User creates statement US_20
    When User executes query for updated meet US_20
    Then User validates result set US_20
    Then User terminates connection US_20

  Scenario: Teacher deletes the meeting by Id
    When teacher deletes the meeting by id