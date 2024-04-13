@US_11 @dimitris
  Feature: Vice Deans should be able to view the lesson schedule and make updates.
    Scenario: Vice Deans should be able to view the lesson schedule and make updates.
      Given User should navigate to "https://managementonschools.com/"
      And User clicks on Login Button
      And User enters User Name
      And User enters Password
      And User clicks on login button (submit)
      When User clicks on menu
      And User verify that sees Lesson Management, teacher Management, student management, contact get all and log out
      And User clicks on Lesson Management
      And User clicks on Lesson Program
      And User goes to Lesson Program Assignment
      And User clicks on choose lesson box
      And User clicks on choose teacher dropdown
      And User clicks on Assignment Submit button
      Then  User must see success message
      And User close the web page