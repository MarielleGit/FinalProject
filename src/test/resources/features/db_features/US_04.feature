@us04_db
Feature: Dean Creation Validation DB

  Scenario: Admin Creates Dean Test (API)
    Given User is authorized as "Admin"
    And User sets the Url for Dean Save
    And sets the payload for Dean Save
    When sends POST request and get response
    Then verifies status code is 200
    And verifies response body

  Scenario: User Validates Created Dean From DB
    Given User sets connection serife
    And User creates statement serife
    When User executes query for created dean serife
    Then validates result set serife
    And terminate connection serife

  Scenario: Admin deletes created Dean Test
    And User gets id of the Dean with username "AliCancan"
    And User sets the Url for Get Dean By id
    And User deletes the created dean

#  Scenario: User Validates Created Dean From DB
#    Given User sets connection
#   And User creates statement
#    When User executes query for created dean
#    Then validates result set
#     And terminate connection

    #I used different dean already exist in the dean list so I don't need to add API steps here