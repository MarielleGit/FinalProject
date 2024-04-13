@us_14 @regression
Feature: See and update teacher
  Background: Login as a Vice Dean
    Given Vice Dean goes to "https://managementonschools.com/" homepage
    And clicks on Login right corner of the page
    And enters username in the Username input field
    And enters password in the password input field
    And clicks on Login button
@smoke
  Scenario: UA_14 TC_01 Vice Dean should be able to see and update teachers.
    When click on the Menu button on the right corner of the page
    And selects Teacher Management on the menu
    And finds the teacher created on the Teacher List on the page
    And clicks on Edit button on the teacher name
    And selects lesson on Choose Lessons on Edit Box
    And enters a valid teacher Name on Edit Box
    And enters a valid teacher Surname on Edit Box
    And enters a valid Birth Place on Edit Box
    And enters a valid email address on Edit Box
    And enters a valid Phone number on Edit Box
    And enters a valid SSN on Edit Box
    And selects the Is Advisor Teacher box on Edit Box
    And selects the teacher Gender on Edit Box
    And enters a valid Date of Birth on Edit Box
    And enters a valid User Name on Edit Box
    And enters a valid Password on Edit Box
    And clicks on Submit button on Edit Box
    Then sees the message "Teacher updated Successful" on Edit Box
    And close the driver

 Scenario: US_14 TC_02 Vice Dean should be able to see and update teachers.
    When click on the Menu button on the right corner of the page
    And selects Teacher Management on the menu
    And finds the teacher created on the Teacher List on the page
    And clicks on Edit button on the teacher name
    And selects lesson on Choose Lessons on Edit Box
    And enters a valid teacher Name on Edit Box
    And enters a valid teacher Surname on Edit Box
    And let the Birth Place on Edit Box empty
    And enters a valid email address on Edit Box
    And enters a valid Phone number on Edit Box
    And enters a valid SSN on Edit Box
    And selects the Is Advisor Teacher box on Edit Box
    And selects the teacher Gender on Edit Box
    And enters a valid Date of Birth on Edit Box
    And enters a valid User Name on Edit Box
    And enters a valid Password on Edit Box
    And clicks on Submit button on Edit Box
    Then sees "Required" message on the Birth Place box
    And close the driver


