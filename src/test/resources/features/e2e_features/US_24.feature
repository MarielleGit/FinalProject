@e2e_24
Feature: Admin_Adds_Teacher

  Scenario:US_24 TC_01 Admin should be able to add Teacher
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
    And Admin enters the  admin username
    And Admin enters the  admin password
    And Admin clicks on the Login button
    When Admin clicks the Menu button
    And Admin clicks on the Teacher Management option
    And Admin selects first lesson from lessons option
    And Admin enters a teacher name as "namık"
    And Admin enters a teacher surname as "Selimm"
    And Admin enters a Birth Place as "Urfa"
    And Admin enters a teacher email as "NMkk@gmail.com"
    And Admin enters a phone number "639-677-3233"
    And Admin clicks on the Is Adviser Teacher box
    And Admin clicks on one option from Gender boxes
    And Admin enters Date of Birth in Date of Birth field as "01.01.2013"
    And Admin enters a teacher Ssn number as "639-77-5399"
    And Admin enters a User Name "Namıkok"
    And Admin enters a password "Namıkk197"
    And Admin clicks on Submit button
    Then Admin verify to see a success message "Teacher saved successfully"
    And close the web page
  Scenario: Admin gets the information for the created Teacher
    Given User is authorized as "Admin"
    And User gets id of the Teacher with name "namık"
    And sets the expected data for Get Teacher By name
    When sends GET request and get response for Teacher
    Then verifies status code for teacher is 200
    And verifies response body for Get Teacher By id
  Scenario: User Validates Created Teacher From DB
    Given User sets connection teacher
    And User creates statement teacher
    When User executes query for created teacher
    Then validates result set teacher
    And User terminates connection teacher
  Scenario: Admin deletes created Teacher Test
    Given User is authorized as "Admin"
    And User gets id of the Teacher with name "namık"
    And User deletes the created Teacher