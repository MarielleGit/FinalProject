@us2 @ey @regression

Feature: US_02 Admin see the Guest user list

  Background:
    Given Student goes to website "https://managementonschools.com/"
    And the students clicks login button
    And Admin types the username
    And Admin types the password
    And Admin clicks on Login button
    And Admin clicks on menu button

@smoke
  Scenario: TC_01 The admin see the Guest user list
    When Admin clicks on the Guest user of the main menu
    And Admin should be able to see Name, Phone Number, SSN and User Name information in the guest user list.
    And Admin must be able to delete information, from the Guest User List.
    And Admin must be able to see "Guest User deleted Successful" message
    And close the driver


  Scenario: TC_02 The admin see the Guest user list
    When Admin click Contact All of the main menu
    And Admin must not see "Guest User List" of the header
    And close the driver
