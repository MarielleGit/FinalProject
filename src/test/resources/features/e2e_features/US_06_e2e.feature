 @US_06_E2E

Feature: Admin creates Dean Account


  Scenario: US_06 Test_Case01 (UI)
    Given admin goes to "https://managementonschools.com" homepage
    And User clicks on Login button right corner of the page
    And User enters a valid User name
    And User enters a valid password
    And User clicks on Login button
    When User enters name in name field
    And User enters last name in the Surname field
    And User enters place of birth in the Birth Place field
    And User select gender
    And User enters date of birth in the date of birth field
    And User enters phone number in the phone number field
    And User enters social security number in the SSN field
    And User enters user name in the User Name field
    And User enters valid password in the Password field
    And User clicks the Submit button
    Then User sees a completed message
    And close the browser

  Scenario: US_06 TC1
    Given User is authorized as "Dean" for US_06
    And User sets the Url for Vice Dean Save
    And sets the payload for Vice Dean
    When sends post request and get response
    Then verifies status code is 200 for US_06
    And verifies ViceDean response body

  Scenario: Admin gets the information for the created ViceDean Test (API)
    Given User is authorized as "Dean" for US_06
    And User gets id of the ViceDean with username "ViceDean1000"
    And User sets the Url for Get ViceDean By id
    And sets the expected data for Get ViceDean By id
    When sends get request and get response
    Then verifies status code is 200 for US_06
    And verifies response body for Get ViceDean By id

  Scenario: User Validates Created Dean From DB
    Given User Set connection for US_06
    And User creates statement for US_06
    When User execute query for created vice dean for US_06
    Then validates result set for US_06
    And User terminate connection for US_06

  Scenario: Admin deletes created Dean Test (API)
    Given User is authorized as "Dean" for US_06
    And User gets id of the ViceDean with username "ViceDean1000"
    And User sets the Url for Get ViceDean By id
    And User deletes the created ViceDean