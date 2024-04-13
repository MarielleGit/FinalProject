@us_23_api
Feature: CreatedViceDean_ApiValidation
  Background: Login as an Admin
    Given User is authorized as "Admin"

  Scenario: Get all ViceDeans
    When admin sets the url to send the getAll request for vice deans
    And  admin sends GET request for all vice deans
    And admin gets the id of new created vice dean



  Scenario: Get Vice Dean by ID
    When admin sends GET request for the vice dean by its id
    And admin sets the expected data for vice dean
    And admin gets the response body for vice dean as actual data
    Then admin verify response body of created vice dean

  Scenario: admin deletes the created Vice Dean
    When admin deletes the created vice dean by id