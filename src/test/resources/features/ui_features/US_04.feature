@us_04 @regression
Feature: US_04 Add Dean
  Background: Login as a Admin
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
    And Admin enters the  admin username
    And Admin enters the  admin password
    And Admin clicks on the Login button
@smoke
  Scenario: US_04 TC_01 Admin should be able to add Dean
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
    When Admin clicks the Menu button
    And clicks logout option and clicks yes
    Then close the webpage

  Scenario: US_04 TC_02 Admin should NOT be able to add Dean
    When Admin clicks the Menu button
    And clicks Dean Management option
    And enters Dean’s Name
    And enters Dean’s Surname
    And enters Dean’s Birth Place
    And selects Dean’s Gender
    And enters Dean’s Date of Birth
    And enters Dean’s Phone Number
    And enters invalid SSN Number
    And enters user name
    And enters password
    And clicks Submit button
    Then see Please enter valid SSN number message
    And close the webpage
