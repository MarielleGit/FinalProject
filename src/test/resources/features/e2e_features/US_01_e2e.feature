@e2e_01
Feature: US_01 User register on the page




  Scenario: user register on page(API)
    Given User is authorized as "Admin"
    And User sets the Url for guest User
    And sets the payload for guest User
    When sends POST request and get response for guest user
    Then verifies status code is 200 for guest user
    And verifies response body guest user

#  Scenario: TC_01 The students register (UI)
#    Given Student goes to website "https://managementonschools.com/"
#    And the students clicks register button
#    And students write their name
#    And students write their surname
#    And students write their birth place
#    And students write their phone number
#    And students select their gender
#    And students write their date of birth
#    And students write their ssn
#    And students write their username
#    And students write their password
#    And students click register button
#    Then students must see "Guest User Registered" message
#    And close the web page

  Scenario: User Register guest user list validation
    Given User sets connection for guest user
    And User creates statement for guest user
    When User executes query for created email
    Then user validates result set for guest user
    And User terminates connection for guest user


  Scenario: User deletes created guest user (API)
    Given User is authorized as "Admin"
    And User sets the Url for delete guest user By id
    And User deletes the created guest user





