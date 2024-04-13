@US_10_E2E
Feature: Vice Deans should be able to create a lesson schedule.
  Background: Login part as a vice dean
    Given User should navigate to "https://managementonschools.com/"
    And User clicks on Login Button
    And User enters User Name
    And User enters Password
    And User clicks on login button (submit)

  Scenario: US_10 TC1_01 Vice Dean should be able to create a lesson schedule
    When User clicks on Menu
    And User sees Lesson Management, teacher Management, student management, contact get all and log out
    And User clicks Lesson Management
    And User clicks Lesson Program
    And User clicks on choose lesson
    And User clicks on choose education term
    And User choose day
    And User enters start stop time
    And User clicks clicks on Submit button
    Then User sees success message
    And User close the web page

  Scenario: US_10 TC_02 Vice Dean should NOT be able to create a lesson schedule
    When User clicks on menu
    And User sees Lesson Management, teacher Management, student management, contact get all and log out
    And User clicks on Lesson Management
    And User clicks on Lesson Program
    And User clicks on choose lesson
    And User clicks on choose education term
    And User choose day
    And User enters start stop same time
    And User clicks on Submit button
    Then User sees error message
    And User close the web page


  Scenario: Vice Dean Creates Lesson Program
    Given User is authorized as "vicedean"
    And User sets the Url to create Lesson Program
    And sets the payload to create Lesson Program
    When sends POST request and get response for creating Lesson program
    Then verifies status code is 200 for created lesson program
    And verifies response body for creating lesson program
    And User deletes the created lesson program
    Then verifies status code is 200 for deleted lesson