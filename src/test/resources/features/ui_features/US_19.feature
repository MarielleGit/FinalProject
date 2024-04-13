@us_19 @regression
Feature: Create meetings with students
  Background: Login part as a Teacher
    Given Admin goes to website "https://managementonschools.com/"
    And User clicks on Login button on homepage
    And User types the username of his teacher account
    And User types the password of his teacher account
    And Teacher clicks on Login button
  Scenario: US_19 TC_01 The teacher should be able to create meetings with students
    When User clicks on menu button
    And User clicks on Meet Management
    And User must see Meet Management on the screen
    And User clicks on select student button and selects a student from the menu
    And User types a FUTURE date in Date of Meet box
    And User types the start time in Start Time box
    And User types the stop time in Stop Time box
    And User types a short description on meeting in Description box
    And User clicks on Meet Management submit button
    Then User must see Meet saved successfully message
    And User closes the page
  Scenario: US_19 TC_02 The teacher should be able to create meetings with students
    When User clicks on menu button
    And User clicks on Meet Management
    And User must see Meet Management on the screen
    And User clicks on select student button and selects a student from the menu
    And User types a PAST date in Date of Meet box
    And User types the start time in Start Time box
    And User types the stop time in Stop Time box
    And User types a short description on meeting in Description box
    And User clicks on Meet Management submit button
    Then User must see must be a future date message on meet page
    And User closes the page
    # ya da "ileri bir tarih olmalı"
