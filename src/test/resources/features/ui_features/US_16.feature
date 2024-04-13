@us_16
Feature: View and Delete Messages by Vice Dean

  Background: Login part as a Vice Dean
      Given The Vice Dean navigates to "https://managementonschools.com/"
      And The Vice Dean clicks on Login button on homepage
      And The Vice Dean types the username
      And The Vice Dean types the password
      And The Vice Dean clicks on Login button

    Scenario: US_16 TC_01 - Vice Dean views messages sent by users
      When The Vice Dean clicks on the Menu button
      And The Vice Dean selects Contact Get All option
      Then The Vice Dean should see the Contact Message page
      And The Vice Dean should see Contact Messages
      And  cclose driver


#  Scenario: US_16 TC_02 - Vice Dean deletes messages sent by users
#    When The Vice Dean clicks on the Menu button
#    And The Vice Dean selects "Contact Get All" option
#    Then The Vice Dean should see the Contact Message page
#    And The Vice Dean should see Contact Messages
#    But The Vice Dean cannot see the Delete button
#    And The Vice Dean cannot delete messages
#      And  cclose driver