@us_23 @regression

  Feature: admin creates vice dean

    Background: Login_Part
      Given Admin goes to website "https://managementonschools.com/"
      And Admin clicks on the Log in button at the home page
      And Admin enters the  admin username
      And Admin enters the  admin password
      And Admin clicks on the Login button
      And admin clicks the menuButton
      And admin click the Vice Dean Management

@smoke
      Scenario: US_23_TC_01
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

      Scenario: US_23_TC_02
        When Admin enters the first name for new Vice Dean
        And Admin enters the surname for new Vice Dean
        And Admin enters the birth place of new Vice Dean
        And Admin enters gender of new Vice Dean
        And Admin enters birth date of new Vice Dean
        And Admin enters phone number of new Vice Dean in the format(xxx-xxx-xxxx)
        And Admin enters new SSN number of new Vice Dean in the format(xxx-xx-xxxx)
        And Admin leaves the username field empty
        And Admin enters a password for new Vice Dean(at least eight chars and UpC,LowC,Num)
        And Admin clicks the submit button
        And Admin should see Required message under username field
        Then Admin should NOT see the new Vice Dean in the Vice Dean List
        And close the browser

      Scenario: US_23_TC_03
        When Admin enters the first name for new Vice Dean
        And Admin enters the surname for new Vice Dean
        And Admin enters the birth place of new Vice Dean
        And Admin enters gender of new Vice Dean
        And Admin enters birth date of new Vice Dean
        And Admin enters phone number of new Vice Dean in the format(xxx-xxx-xxxx)
        And Admin enters new SSN number of new Vice Dean in the format(xxx-xx-xxxx)
        And Admin enters a username for new Vice Dean
        And Admin enters a password for new admin(at least eight chars and UpC,LowC)
        And Admin clicks the submit button
        And Admin should see One Number message under the password field
        Then Admin should NOT see the new Vice Dean in the Vice Dean List
        And close the browser

      Scenario: US_23_TC_04
        When Admin enters the first name for new Vice Dean
        And Admin enters the surname for new Vice Dean
        And Admin enters the birth place of new Vice Dean
        And Admin enters gender of new Vice Dean
        And Admin enters birth date of new Vice Dean
        And Admin enters phone number of new Vice Dean in the format(xxx-xxx-xxxx)
        And Admin enters new SSN number of new Vice Dean in the format(xxx-xx-xxxx)
        And Admin enters a username for new Vice Dean
        And Admin leaves the password field empty
        And Admin clicks the submit button
        And Admin should NOT see the new Vice Dean in the Vice Dean List
        And close the browser
        