@e2e_22
Feature: Admin adds new admin

  Scenario:US_22 TC_01 Admin should be able to add new admin
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
    And Admin enters the  admin username
    And Admin enters the  admin password
    And Admin clicks on the Login button
    When Admin enters the first name for new Admin
    And Admin enters the surname for new Admin
    And Admin enters the birth place of new Admin
    And Admin enters gender of new Admin
    And Admin enters birth date of new Admin
    And Admin enters phone number of new Admin in the format(xxx-xxx-xxxx)
    And Admin enters SSN number of new Admin in the format(xxx-xx-xxxx)
    And Admin enters a username for new Admin
    And Admin enters a password for new admin(at least eight chars and UpC,LowC,Num)
    And Admin clicks the Submit button
    Then Admin should see Admin saved message
    And Admin should see the new Admin in the Admin List
    And close the browser
  Scenario: Admin gets the information for the created admin
    Given User is authorized as "Admin"
    Given admin sets the url to send the getAll request for admins
    And  admin sends GET request for all admins
    And admin gets the id of new created admin
    Given admin sends GetAll request and selects the created admin
    And admin sets the expected data for admin
    Then admin verify response body of created admin

  Scenario: User Validates Created Admin From DB
    Given User sets connection for admin
    And User creates statement for admin
    When User executes query for created admin
    Then validates result set for admin
    And User terminates connection for admin


  Scenario: admin deletes the created admin
    Given User is authorized as "Admin"
    When admin deletes the created admin by id