@us_12 @regression
Feature: Assign lessons to teachers
  Background: Login part as a Vice Dean
    Given Admin goes to website "https://managementonschools.com/"
    And User clicks on Login button on homepage
    And User types the username of his Vice Dean account
    And User types the password of his Vice Dean account
    And Admin clicks on the Login button
  Scenario: US_12 TC_01 Vice Deans should be able to assign lessons to teachers
    When User clicks on Lesson Program part
    And User scrolls down to choose a lesson
    And User chooses a lesson from Lesson Program Assignment part
    And User scrolls down to choose a teacher
    And User clicks on choose teacher button and selects a teacher from the menu
    And User clicks on submit button
    Then User must see Lesson added to Teacher message
    And User closes the page
  Scenario: US_12 TC_02 Vice Deans should not be able to assign lessons to teachers
    When User clicks on Lesson Program part
    And User chooses a lesson from Lesson Program Assignment part
    And User scrolls down to choose a teacher
    And User clicks on submit button
    Then User must see The given id must not be null! message
    And User closes the page









