@us_22 @regression

  Feature: admin creates new admin
    Background: Login_Part
      Given Admin goes to website "https://managementonschools.com/"
      And Admin clicks on the Log in button at the home page
      And Admin enters the  admin username
      And Admin enters the  admin password
      And Admin clicks on the Login button


      Scenario: US_22_TC_01
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

      Scenario: US_22_TC_02
        When Admin enters the first name for new Admin
        And Admin enters the surname for new Admin
        And Admin enters the birth place of new Admin
        And Admin enters gender of new Admin
        And Admin enters birth date of new Admin
        And Admin enters phone number of new Admin in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Admin in the format(xxx-xx-xxxx)
        And Admin enters a username for new Admin
        And Admin enters a password for new admin(less than eight chars and UpC,LowC,Num)
        And Admin clicks the Submit button
        Then Admin should see the At least 8 characters still visible
        And Admin should not see the New Admin in the Admin List
        And close the browser

      Scenario: US_22_TC_03
        When Admin enters the first name for new Admin
        And Admin enters the surname for new Admin
        And Admin enters the birth place of new Admin
        And Admin enters gender of new Admin
        And Admin enters birth date of new Admin
        And Admin enters phone number of new Admin in the format(xxx-xxx-xxxx)
        And Admin enters SSN in different format (changes the places of -)
        And Admin enters a username for new Admin
        And Admin enters a password for new admin(at least eight chars and UpC,LowC,Num)
        And Admin clicks the Submit button
        And Admin should see Please enter valid SSN number message
        Then Admin should not see the New Admin in the Admin List
        And close the browser

      Scenario: US_22_TC_04
        When Admin enters the first name for new Admin
        And Admin enters the surname for new Admin
        And Admin enters the birth place of new Admin
        And Admin enters gender of new Admin
        And Admin enters birth date of new Admin
        And Admin enters phone number of new Admin in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Admin in the format(xxx-xx-xxxx)
        And Admin enters a username for new Admin
        And Admin leaves the password field empty
        And Admin clicks the Submit button
        Then Admin should not see the New Admin in the Admin List
        And close the browser
