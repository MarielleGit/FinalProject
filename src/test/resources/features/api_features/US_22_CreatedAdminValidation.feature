@us_22_api
Feature: CreatedAdmin_ApiValidation
  Background: Login as an Admin
    Given User is authorized as "Admin"

  Scenario: Get all admins
    Given admin sets the url to send the getAll request for admins
    And  admin sends GET request for all admins
    And admin gets the id of new created admin



  Scenario: select the created admin from getAll response
    Given admin sends GetAll request and selects the created admin
    And admin sets the expected data for admin
    Then admin verify response body of created admin

  Scenario: admin deletes the created admin
    When admin deletes the created admin by id


