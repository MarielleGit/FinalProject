@US_21_api @dimitris_api
  Feature: Students create lesson
    Background: Login as a student
      Given User is authorized as "student"

    Scenario: Student tries to create a lesson
      And User sets the Url for lesson Save
      And sets the payload for lesson Save
      And sends POST request and get response as a student
      Then verifies status code is 403 for the student




