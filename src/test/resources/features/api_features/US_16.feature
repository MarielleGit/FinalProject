@us_16api

Feature: US_16 The Vice Dean can see message from user
  Background: vice dean login
    Given User is authorized as "vicedean"

  Scenario: US_16  User send messages via Api
    When User sets the Url to post message
    And User sets the payload for message
    And User sends post request and get response
    Then User verifies status code is 200

  Scenario: US_16  The Vice Dean get the messages by email
    When The Vice Dean sets the Url to get message by email
    And The Vice Dean sets the payload for message
    And The Vice Dean sends get request by email
    Then User verifies status code is 200
    And The Vice Dean verifies response body