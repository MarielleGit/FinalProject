@us_15 @regression
Feature: Create a student
  Background: Login as a Vice Dean
    Given Vice Dean goes to "https://managementonschools.com/" homepage
    And clicks on Login right corner of the page
    And enters username in the Username input field
    And enters password in the password input field
    And clicks on Login button

  Scenario: US_15 TC_01 Vice Deans should be able to create a student.++-
  When click on the Menu button on the right corner of the page
  And selects Student Management on the dropdown list
  And select the teacher on the dropdown list
  And enters a valid student Name
  And enters a valid student Surname
  And enters the student Birth Place
  And enters a valid email address
  And enters a valid Phone number
  And selects the student gender
  And enters the Date of Birth
  And enters a valid SSN number
  And enters a valid User name
  And enters the student Father's name
  And enters the student Mother's name
  And enters a valid Password
  And clicks on Submit button
  Then sees the success message "Student saved Successfully"
  And close the driver

  Scenario: US_15 TC_02 Vice Deans should NOT be able to create a student.++-
  When click on the Menu button on the right corner of the page
  And selects Student Management on the dropdown list
  And select the teacher on the dropdown list
  And enters a valid student Name
  And enters a valid student Surname
  And enters the student Birth Place
  And enters a valid email address
  And enters a valid Phone number
  And selects the student gender
  And enters the Date of Birth
  And enters a INVALID SSN number
  And enters a valid Username
  And enters the student Father's name
  And enters the student Mother's name
  And enters a valid Password
  And clicks on Submit button
  Then sees the failed message "Please enter valid SSN number"
  And close the driver