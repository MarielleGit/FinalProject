@us03_api @api
Feature: User should be able to send messages from the page Contact

#post
  Scenario: user sends message from contact
    Given User sets the Url for contact message
    And user sets the payload for contact message
    And user sends POST request and get response for contact message
    Then verifies status code is 200 for contact message
    And verifies response body for contact message


#getAll
  Scenario: Admin seems message information
    Given admin sets the Url for contact messages getAll
    When admin sets the expected data for contact messages getAll
    And admin sent the request and get the respond for contact messages getAll
    Then admin verifies status code is 200 for contact message getAll
    And verifies response body for contact message for getAll











