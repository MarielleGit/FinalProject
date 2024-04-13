@us18_api
Feature: US_18 Get Update and Delete Student info
  Background: authorize as an Teacher
    Given User is authorized as "teacherIbrahim"

  Scenario: Teacher get the created Student info by Id
    When Teacher sets the Url for GetId Student info for teacher
    And Teacher sets the expected data for to updated Student info
    And Teacher sends GETId request and get response
    And Teacher set the url to update Student info
    And Teacher set update request for student info
    Then Teacher verifies new body for update



  Scenario: Teacher deletes created Student info
    When Teacher deletes Student info by id