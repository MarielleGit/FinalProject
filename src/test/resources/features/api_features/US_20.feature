@us20_api
Feature: US_20 Teacher should be able to update meetings with students
  Background: Login as a Teacher
    Given User is authorized as "admin"
  Scenario: Teacher updates the meetings
    When gets id of the created meeting
    And sets the Url for updating meeting with students
    And sets the expected data to update the meeting
    And updates the meeting with id
    Then verifies response body for updating meeting

  Scenario: Teacher deletes the meeting by Id
    When teacher deletes the meeting by id

