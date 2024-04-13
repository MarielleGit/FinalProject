Feature: Deans should be able to see the messages sent by users
Scenario: US_07 TC1
  Given User is authorized as "Dean" for US_06
  And User sets url for message save
  And sets the payload for message
  When sends post request and get response from contact Messages
  Then verifies status code is 200 for contact messages
  And verifies contact Messages response body
  Scenario: Admin gets the information for the created Contact Messages
    Given User is authorized as "Dean" for US_06
    And User sets the Url for Get contact By email "vicedean@vicedean.com"
#    And sets the expected data for Get contact messages By email
    When sends get request and get response for contact messages
    Then verifies status code is 200 for contact messages
    And verifies response body for Get contact messages By email

