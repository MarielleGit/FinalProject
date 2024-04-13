@US_06 @EP

Feature: Admin creates Dean Account
  Background:
    Given admin goes to "https://managementonschools.com" homepage
    And User clicks on Login button right corner of the page
    And User enters a valid User name
    And User enters a valid password
    And User clicks on Login button

  Scenario: US_06 Test_Case01
    When User enters name in name field
    And User enters last name in the Surname field
    And User enters place of birth in the Birth Place field
    And User select gender
    And User enters date of birth in the date of birth field
    And User enters phone number in the phone number field
    And User enters social security number in the SSN field
    And User enters user name in the User Name field
    And User enters valid password in the Password field
    And User clicks the Submit button
    Then User sees a completed message
    And close the browser

  Scenario: US_06 Test_Case02
    When User enters name in name field
    And User enters last name in the Surname field
    And User enters place of birth in the Birth Place field
    And User select gender
    And User enters date of birth in the date of birth field
    And User enters phone number that not contains - in the phone number field
    And User enters social security number in the SSN field
    And User enters user name in the User Name field
    And User enters valid password in the Password field
    And User clicks the Submit button
    Then User sees a error message phone number
    And close the browser
