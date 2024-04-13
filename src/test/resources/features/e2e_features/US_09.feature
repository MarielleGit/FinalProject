@us09_e2e  @serife
Feature: US_09 Delete Lesson e2e
  Background: Login as a Vice Dean
    Given User is authorized as "vicedean"

  Scenario: Add Lesson as Vice Dean
    And Vice Dean sets the Url to add Lesson
    And Vice Dean sets the payload to add Lesson
    And Vice Dean sends POST request and get response
    Then verifies status code is 200 for added Lesson
    And Vice Dean verifies response body

  Scenario: Delete Lesson as Vice Dean
    And Vice Dean gets id of the added Lesson
    And Vice Dean sets the Url for Get Lesson By id
    And Vice Dean deletes the added Lesson
    Then verifies status code is 200 for added Lesson

