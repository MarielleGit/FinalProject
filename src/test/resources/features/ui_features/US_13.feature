@us_13
Feature: Create a teacher
  Background: Login as a Vice Dean
    Given Vice Dean goes to "https://managementonschools.com/" homepage
    And clicks on Login right corner of the page
    And enters username in the Username input field
    And enters password in the password input field
    And clicks on Login button

  Scenario: US_13 TC_02 Vice Deans should be able to create a teacher
    When click on the Menu button on the right corner of the page
    And selects Teacher Management on the menu
    And selects lesson on Choose Lessons dropdown list
    And enters a valid teacher Name
    And enters a valid teacher Surname
    And enters a valid Birth Place
    And enters a valid email address
    And enters a valid Phone number
    And selects the Is Advisor Teacher box
    And selects the teacher Gender
    And enters a valid Date of Birth
    And enters a valid SSN
    And enters a valid UserName
    And enters a valid Password
    And clicks on Submit button
    Then sees the message "Teacher saved successfully"
    And close the driver

  Scenario: US_13 TC_03 Vice Deans should be able to create a teacher.
    When click on the Menu button on the right corner of the page
    And selects Teacher Management on the menu
    And selects lesson on Choose Lessons dropdown list
    And enters a valid teacher Name
    And enters a valid teacher Surname
    And enters a valid Birth Place
    And enters a valid email address
    And enters a valid Phone number
    And selects the Is Advisor Teacher box
    And selects the teacher Gender
    And enters a valid Date of Birth
    And enters a INVALID SSN
    And enters a valid UserName
    And enters a valid Password
    And clicks on Submit button
    Then sees the error message "Please enter valid SSN number"
    And close the driver
