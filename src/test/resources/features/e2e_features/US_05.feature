@us05_e2e @serife
Feature: US_05 Add and delete Dean e2e

  Scenario: Admin should be able to add Dean  (UI)
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
    And Admin enters the  admin username
    And Admin enters the  admin password
    And Admin clicks on the Login button
    When Admin clicks the Menu button
    And clicks Dean Management option
    And enters Dean’s Name
    And enters Dean’s Surname
    And enters Dean’s Birth Place
    And selects Dean’s Gender
    And enters Dean’s Date of Birth
    And enters Dean’s Phone Number
    And enters SSN Number
    And enters user name
    And enters password
    And clicks Submit button
    Then see Dean Saved message
    Then close the webpage

  Scenario: Admin gets the information for the created Dean Test (API)
    Given User is authorized as "Admin"
    And User gets id of the Dean with username "AliCancan"
    And User sets the Url for Get Dean By id
    And sets the expected data for Get Dean By id
    When sends GET request and get response
    Then verifies status code is 200
    And verifies response body for Get Dean By id

  Scenario: Admin deletes created Dean Test  (API)
    Given User is authorized as "Admin"
    And User gets id of the Dean with username "AliCancan"
    And User sets the Url for Get Dean By id
    And User deletes the created dean

  Scenario: Verify deleted Dean by using DB  (DB)
    Given set connection
    When executes query with userId that is deleted
    Then verify deletion