@us17_api
Feature: US_17 Get and Delete Student info
  Background: Login as an Teacher
    Given User is authorized as "teacherIbrahim"

Scenario: Teacher get the created Student info
  When Teacher sets the Url for GetAll Student info for teacher
  And Teacher sets the expected data for Student info
  And Teacher sends GETAll request and get response
  And Teacher get id of created Student info
  Then Teacher verifies status code is 200
  And Teacher verifies response body for Student info
