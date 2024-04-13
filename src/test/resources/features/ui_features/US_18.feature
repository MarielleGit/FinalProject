@us_18
Feature: View and Update Student Grades by Teacher

  Background: Login part as a Teacher
    Given Thet teacher navigates to "https://managementonschools.com/"
    And Thet teacher clicks on Login button on homepage
    And Thet teacher enters the username
    And Thet teacher enters the password
    And Thet teacher clicks on Login button

@smoke
  Scenario: US_18 TC_01 - Teacher views and updates grades for students (Student Info List)
     When Thet teacher sees Student Info Management page
     And Thet teacher sees Student Info List
     And Thet teacher sees Student
     And Thet teacher clicks Edit button
     And Thet teacher sees Edit Student Info Menu
     And Thet teacher select choose lesson Edit Student Info Menu
     And Thet teacher select education term Edit Student Info Menu
     And Thet teacher enters Absentee
     And Thet teacher enters Midterm Exam
     And Thet teacher enters Final Exam
     And Thet teacher enters Info Note
     And Thet teacher clicks Submit Button
     And Thet teacher must see "Student Info Updated Succesfully" message
     And tdClose driver

  Scenario: US_18 TC_02 - Teacher unable to view and update grades for students (Student Info List)
    When Theti teacher sees Student Info Management page
    And Theti teacher sees Student Info List
    And Theti teacher sees Student
    And Theti teacher clicks Edit button
    And Theti teacher sees Edit Student Info Menu
    And Theti teacher enters Absentee
    And Theti teacher enters Midterm Exam
    And Theti teacher enters Final Exam
    And Theti teacher enters Info Note
    And Theti teacher clicks Submit Button
    And Theti teachers must see javascript pop-up message "'100.0' değerinden küçük yada eşit olmalı" message
    And Theti close driver



  #"'100'değerinden küçük yada eşit olmalı"