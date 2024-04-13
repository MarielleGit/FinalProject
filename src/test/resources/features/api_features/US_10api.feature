@US_10_api @dimitris_api
  Feature: US_10 Vice Deans should be able to create a lesson schedule.
    Background: Login as an Vice Dean
      Given User is authorized as "vicedean"

    Scenario: Vice Dean Creates Lesson Program
      And User sets the Url to create Lesson Program
      And sets the payload to create Lesson Program
      When sends POST request and get response for creating Lesson program
      Then verifies status code is 200 for created lesson program
      And verifies response body for creating lesson program
      And User deletes the created lesson program
      Then verifies status code is 200 for deleted lesson

