@us1 @ey @regression

Feature: US_01 Students login register

  Background:
    Given Student goes to website "https://managementonschools.com/"
    And the students clicks register button
    And students write their name
    And students write their surname
    And students write their birth place
    And students write their phone number
    And students select their gender
    And students write their date of birth
    And students write their ssn
    And students write their username
@smoke
  Scenario: TC_01 The students register
    And students write their password
    And students click register button
    Then students must see "Guest User Registered" message
    And close the web page


  Scenario: TC_02 The students should not register
    And student writes their password
    Then students must see the "One uppercase character" message
    Then students should not click register button
    And close the web page


