@US_07_E2E
Feature: Deans should be able to see the messages sent by users (UI)
  Scenario: US_07 Test_Case01
    Given  admin goes to "https://managementonschools.com" homepage
    When User clicks on Login button right corner of the page
    And User enters a valid User name
    And User enters a valid password
    And User clicks on Login button
    And User clicks on Menu button right corner of the page
    And User clicks on Contact Get All left side of the page
    Then User sees Messages, authors, emails, sending dates, and subject information
    And close the browser

  Scenario: US_07 TC1 (API)
    Given User is authorized as "Dean" for US_06
    And User sets url for message save
    And sets the payload for message
    When sends post request and get response from contact Messages
    Then verifies status code is 200 for contact messages
    And verifies contact Messages response body

  Scenario: Admin gets the information for the created Contact Messages (API)
    Given User is authorized as "Dean" for US_06
    And User sets the Url for Get contact By email "vicedean@vicedean.com"
#    And sets the expected data for Get contact messages By email
    When sends get request and get response for contact messages
    Then verifies status code is 200 for contact messages
    And verifies response body for Get contact messages By email
  Scenario: User Validates Created Dean From (DB)

    Given User Set connection for contact message for US_07
    And User creates statement for contact message for US_07
    When User execute query for created messages for US_07
    Then validates result set for contact message for US_07
    And User terminate connection for contact message for US_07

