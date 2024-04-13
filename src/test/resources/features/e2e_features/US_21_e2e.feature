@US_21_E2E
Feature:Students, choose lesson, grades and announcement
  Scenario: Students, Choose Lessons, Grades and Announcements (positive scenario)
    Given User should navigate to "https://managementonschools.com/"
    And User clicks on Login Button
    And User enters User Name as student
    And User enters Password as student
    And User clicks on login button (submit)
    When User clicks on menu as student
    Then User verify that sees Choose Lesson, Grade and Announcements and log out

  Scenario: Students, Choose Lessons, Grades and Announcements (negative scenario)
    And User clicks on Grades and Announcements
    Then User verifies that there is no lesson to choose
    And User close the web page

  Scenario: Student tries to create a lesson
    Given User is authorized as "student"
    And User sets the Url for lesson Save
    And sets the payload for lesson Save
    And sends POST request and get response as a student
    Then verifies status code is 403 for the student


  Scenario: User Validates Created lesson From DB
    Given User sets connection
    And User creates statement
    When User executes query for created lesson
    Then validates result set
    And User terminates connection