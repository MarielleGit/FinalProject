Feature: US_06 Dean creates Vice Dean Account
  Scenario: US_06 TC1
    Given User is authorized as "Dean" for US_06
    And User sets the Url for Vice Dean Save
    And sets the payload for Vice Dean
    When sends post request and get response
    Then verifies status code is 200 for US_06
    And verifies ViceDean response body

  Scenario: Admin gets the information for the created ViceDean Test
    Given User is authorized as "Dean" for US_06
    And User gets id of the ViceDean with username "ViceDean1000"
    And User sets the Url for Get ViceDean By id
    And sets the expected data for Get ViceDean By id
    When sends get request and get response
    Then verifies status code is 200 for US_06
    And verifies response body for Get ViceDean By id

  Scenario: Admin deletes created Dean Test
    Given User is authorized as "Dean" for US_06
    And User gets id of the ViceDean with username "ViceDean1000"
    And User sets the Url for Get ViceDean By id
    And User deletes the created ViceDean
