@us05_api
Feature: US_04 Delete Dean
  Background: Login as an Admin
    Given User is authorized as "Admin"

  Scenario: Admin Creates Dean Test
    And User sets the Url for Dean Save
    And sets the payload for Dean Save
    When sends POST request and get response
    Then verifies status code is 200
    And verifies response body

  Scenario: Admin Deletes Dean Test
    And User gets id of the Dean with username "AliCancan"
    And User sets the Url for Get Dean By id
    And User deletes the created dean
