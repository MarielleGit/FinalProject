@US_21 @dimitris @regression
  Feature:Students, choose lesson, grades and announcement
    Scenario: Students, Choose Lessons, Grades and Announcements (positive scenario)
      Given User should navigate to "https://managementonschools.com/"
      And User clicks on Login Button
      And User enters User Name as student
      And User enters Password as student
      And User clicks on login button (submit)
      When User clicks on menu as student
      Then User verify that sees Choose Lesson, Grade and Announcements and log out

    Scenario: Students, Choose Lessons, Grades and Announcements (negative scenario)
      And User clicks on Grades and Announcements
      Then User verifies that there is no lesson to choose
      And User close the web page

