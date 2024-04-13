@us05_db
Feature:us_05
  Scenario: Admin Creates Dean Test (API)
    Given User is authorized as "Admin"
    And User sets the Url for Dean Save
    And sets the payload for Dean Save
    When sends POST request and get response
    Then verifies status code is 200
    And verifies response body

  Scenario: Admin deletes created Dean Test (API)
    Given User is authorized as "Admin"
    And User gets id of the Dean with username "AliCancan"
    And User sets the Url for Get Dean By id
    And User deletes the created dean

  Scenario: Verify deleted Dean by using DB
    Given set connection
    When executes query with userId that is deleted
    Then verify deletion

# Why did I add API steps here? -->  I have to create and after creation I should delete Dean. Thus I can verify deletion by using DB.
