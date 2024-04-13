@us_16_e2e

Feature: US_16 The Vice Dean can see message from user


  Scenario: US_16  User send messages via Api
    Given User is authorized as "vicedean"
    When User sets the Url to post message
    And User sets the payload for message
    And User sends post request and get response
    Then User verifies status code is 200

  Scenario: US_16  The Vice Dean get the messages by email
    Given User is authorized as "vicedean"
    When The Vice Dean sets the Url to get message by email
    And The Vice Dean sets the payload for message
    And The Vice Dean sends get request by email
    Then User verifies status code is 200
    And The Vice Dean verifies response body

  Scenario: User validates Contact Messages
    Given User sets connection US_16
    And User creates statement US_16
    When User executes query for created meet US_16
    Then User validates result set US_16
    Then User terminates connection US_16