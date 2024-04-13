@us25 @agu @regression
Feature:Admin_Add_Student
  Background: Login_Part
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
    And Admin enters the  admin username
    And Admin enters the  admin password
    And Admin clicks on the Login button
    @smoke @tc01
  Scenario: US_25 TC_01 Admin should be able to add Student
  When Admin clicks the Menu button
  And Admin clicks the Student Management option
  And Admin clicks Choose Advisor Teacher input field and selects first teacher from Choose Teacher option
  And Admin enters a student name
  And Admin enters a student surname
  And Admin enters a Birth Place as Hatay
  And Admin enters an email as "Mercii@gmail.com"
  And Admin enters a phone number as "293-986-9843"
  And Admin clicks the Gender box
  And Admin enters Date of Birth in Date of Birth field as "01.01.2010"
  And Admin enters a Ssn number as "383-87-9848"
  And Admin enters a username as "merciican"
  And Admin enters the Father name
  And Admin enters the Mother name
  And Admin enters a password as "Mercii197"
  And Admin clicks on Submit button in Student Management Page
  Then Admin sees a success message "Student saved Successfully"
  And close the web page
  Scenario: US_25 TC_02 Admin should not be able to add Student
      When Admin clicks the Menu button
      And Admin clicks the Student Management option
      And Admin clicks Choose Advisor Teacher input field and selects first teacher from Choose Teacher option
      And Admin enters a student name
      And Admin enters a student surname
    And Admin enters a Birth Place as Hatay
    And Admin enters an email as "MercooG@gmail.com"
    And Admin enters a phone number as "291-976-9843"
    And Admin clicks the Gender box
    And Admin enters Date of Birth in Date of Birth field as "01.01.2010"
    And Admin enters an invalid Ssn number as "36566965898"
    And Admin enters a username as "mercooGcan"
    And Admin enters the Father name
    And Admin enters the Mother name
    And Admin enters a password as "MercooG197"
    And Admin clicks on Submit button in Student Management Page
      Then Admin sees a failed message "Please enter valid SSN number"
      And close the web page


