@us_20 @regression
Feature: Update meetings with students
  Background: Login part as a Teacher
    Given Admin goes to website "https://managementonschools.com/"
    And User clicks on Login button on homepage
    And User types the username of his teacher account
    And User types the password of his teacher account
    And Teacher clicks on Login button
  Scenario: US_20 TC_01 The teacher should be able to update meetings with students
    When User clicks on menu button
    And User clicks on Meet Management
    And User must see Meet List on the screen
    And User clicks on the edit button of a student
    And User updates the Date of Meeting
    And teacher clicks on Submit button
    Then User must see Meet Updated Successfully message
    And User closes the page
  Scenario: US_20 TC_02 The teacher should not be able to update meetings with students
    When User clicks on menu button
    And User clicks on Meet Management
    And User must see Meet List on the screen
    And User clicks on the edit button of a student
    And User assigns a past date to the Date of Meeting
    And teacher clicks on Submit button
    Then User must see must be a future date message
    And User closes the page
