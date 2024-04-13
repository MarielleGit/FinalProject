
@us3 @ey @regression

Feature: Admin see the Guest user list


  Background:
    Given Student goes to website "https://managementonschools.com/"
    And The user must click Contact


  Scenario: TC_01 User sends message from the page
    And The user must type the Name
    And The user must type the email address
    And The user must type the Subject
    And The user must type Message
    And The user must click Send Message button
    And The user see "Contact Message Created Successfully" message
    And close the web page



  Scenario: TC_02 User sends message from the page
    And user must type the Name
    And user must type the email address
    And user must type the Subject
    And user must type Message
    And user must click Send Message button
    And user see "Please enter valid email" message
    And close the web page



