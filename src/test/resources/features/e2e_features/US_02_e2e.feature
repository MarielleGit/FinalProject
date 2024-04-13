@e2e_02

Feature: US_02 Admin see the Guest user list

  Scenario: TC_01 The admin see the Guest user list  (UI)
    Given Student goes to website "https://managementonschools.com/"
    And the students clicks login button
    And Admin types the username
    And Admin types the password
    And Admin clicks on Login button
    And Admin clicks on menu button
    When Admin clicks on the Guest user of the main menu
    And Admin should be able to see Name, Phone Number, SSN and User Name information in the guest user list.
#    And Admin must be able to delete information, from the Guest User List.
#    And Admin must be able to see "Guest User deleted Successful" message
    And close the driver


  Scenario: user register on page (API)
    Given User is authorized as "Admin"
    And User sets the Url for guest User
    And sets the payload for guest User
    When sends POST request and get response for guest user
    Then verifies status code is 200 for guest user
    And verifies response body guest user

  Scenario: User deletes created guest user list
    Given user gets the id by using getAll
    When User delete guest user list By id


