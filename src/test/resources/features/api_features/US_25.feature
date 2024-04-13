@api25
Feature: US_25 Add Student
  Background: Login as an Admin
    Given User is authorized as "Admin"
    Scenario: Admin Creates Student
      And User sets the Url for Student Save
      And sets the payload for Student Save
      When admins sends POST request and get response for creating student
      Then verifies status code for student
      And verifies response body for student

  Scenario: Admin gets the information for the created Student
    And User gets id of the Student with name "mercan"
    And User sets the Url for Get Student By id
    And sets the expected data for Get Student By id
    When sends GET request and get response for Students
    Then verifies status code for student
    And verifies response body for Get Student By id

  Scenario: Admin deletes created Student Test
    And User gets id of the Student with name "mercan"
    And User sets the Url for Get Student By id
    And User deletes the created Student

