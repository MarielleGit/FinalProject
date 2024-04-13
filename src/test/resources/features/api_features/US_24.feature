@api24
Feature: US_24 Add Teacher
  Background: Login as an Admin
    Given User is authorized as "Admin"
@getuserid
  Scenario: Admin gets the information for the created Teacher
    And User gets id of the Teacher with name "namık"
    And sets the expected data for Get Teacher By name
    When sends GET request and get response for Teacher
    Then verifies status code for teacher is 200
    And verifies response body for Get Teacher By id

  Scenario: Admin deletes created Teacher Test
    And User gets id of the Teacher with name "namık"
    And User deletes the created Teacher

