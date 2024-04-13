@e2e_03


Feature: Admin see the contact message


  Scenario: TC_01 User sends message from the page (UI)
    Given Student goes to website "https://managementonschools.com/"
    And The user must click Contact
    And The user must type the Name
    And The user must type the email address
    And The user must type the Subject
    And The user must type Message
    And The user must click Send Message button
    And The user see "Contact Message Created Successfully" message
    And close the web page



    #post
  Scenario: user sends message from contact (API)
#    Given User is authorized as "Admin"
    Given User sets the Url for contact message
    And user sets the payload for contact message
    And user sends POST request and get response for contact message
    Then verifies status code is 200 for contact message
    And verifies response body for contact message


#getAll
  Scenario: Admin seems message information (API)
    Given User is authorized as "Admin"
    When admin sets the Url for contact messages getAll
    When admin sets the expected data for contact messages getAll
    And admin sent the request and get the respond for contact messages getAll
    Then admin verifies status code is 200 for contact message getAll
    And verifies response body for contact message for getAll





