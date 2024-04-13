@e2e_23
Feature: Admin adds new vice dean

  Scenario:US_22 TC_01 Admin should be able to add new admin
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
    And Admin enters the  admin username
    And Admin enters the  admin password
    And Admin clicks on the Login button
    And admin clicks the menuButton
    And admin click the Vice Dean Management
    When Admin enters the first name for new Vice Dean
    And Admin enters the surname for new Vice Dean
    And Admin enters the birth place of new Vice Dean
    And Admin enters gender of new Vice Dean
    And Admin enters birth date of new Vice Dean
    And Admin enters phone number of new Vice Dean in the format(xxx-xxx-xxxx)
    And Admin enters SSN number of new Vice Dean in the format(xxx-xx-xxxx)
    And Admin enters a username for new Vice Dean
    And Admin enters a password for new Vice Dean(at least eight chars and UpC,LowC,Num)
    And Admin clicks the submit button
    And Admin should see Vice Dean Saved message
    Then Admin should see the new Vice Dean in the Vice Dean List
    And close the browser

  Scenario: Admin gets the information for the created vice dean
    Given User is authorized as "Admin"
    When admin sets the url to send the getAll request for vice deans
    And  admin sends GET request for all vice deans
    And admin gets the id of new created vice dean
    When admin sends GET request for the vice dean by its id
    And admin sets the expected data for vice dean
    And admin gets the response body for vice dean as actual data
    Then admin verify response body of created vice dean

  Scenario: User Validates Created Vice Dean From DB
    Given User sets connection for vice dean
    And User creates statement for vice dean
    When User executes query for created vice dean
    Then validates result set for vice dean
    And User terminates connection for vice dean

  Scenario: admin deletes the created Vice Dean
    Given User is authorized as "Admin"
    When admin deletes the created vice dean by id