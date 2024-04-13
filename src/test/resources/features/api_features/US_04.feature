@us04_api
Feature: US_04 Add Dean
  Background: Login as an Admin
    Given User is authorized as "Admin"
  @createAlican
  Scenario: Admin Creates Dean Test
    And User sets the Url for Dean Save
    And sets the payload for Dean Save
    When sends POST request and get response
    Then verifies status code is 200
    And verifies response body

  Scenario: Admin gets the information for the created Dean Test
    And User gets id of the Dean with username "AliCancan"
    And User sets the Url for Get Dean By id
    And sets the expected data for Get Dean By id
    When sends GET request and get response
    Then verifies status code is 200
    And verifies response body for Get Dean By id

  @deleteAlican
  Scenario: Admin deletes created Dean Test
    And User gets id of the Dean with username "AliCancan"
     And User sets the Url for Get Dean By id
     And User deletes the created dean





