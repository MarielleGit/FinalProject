@US_08 @EP
Feature:Vice Deans should be able to create a lesson (Lessons - Add Lesson)

  Background:
    Given admin goes to "https://managementonschools.com" homepage
    And User clicks on Login button right corner of the page
    And User enters a valid Vice Dean User name
    And User enters a valid Vice Dean password
    And User clicks on Login button
@smoke
  Scenario:US_08 Test_Case01
    When User clicks on Lessons top center of the page
    And User enters lesson name on Lesson Name field
    And User select compulsory button
    And User enters credit score for lesson on Credit Score field
    And User clicks Submit button
    Then User sees a success message
    And close the browser

  Scenario:US_08 Test_Case02
    And User clicks on Lessons top center of the page
    And User enters same lesson name that already created on Lesson Name field
    And User select compulsory button
    And User enters credit score for lesson on Credit Score field
    And User clicks Submit button
    Then User sees a error message
    And close the browser
