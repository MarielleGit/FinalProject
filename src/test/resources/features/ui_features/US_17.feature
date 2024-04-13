@us_17 @regression
Feature: Grade Submission by Teacher

  Background: Login part as a Teacher
    Given The teacher navigates to "https://managementonschools.com/"
    And The teacher clicks on Login button on homepage
    And The teacher enters the username
    And The teacher enters the password
    And The teacher clicks on Login button

@smoke
  Scenario: US_17 TC_01 - Teacher gives grades to students (Add Student Info)
    When The teacher sees Student Info Management page
    And The teacher clicks Choose Lesson
    And The teacher clicks Choose Student
    And The teacher clicks Choose Education Term
    And The teacher enters Absentee
    And The teacher enters Midterm Exam
    And The teacher enters Final Exam
    And The teacher enters Info Note
    And  teacher clicks Submit Button
    And teachers must see Student Info saved Successfully message
    And Close driver


  Scenario: US_17 TC_02 - Teacher unable to give grades to students (Add Student Info)
    When  teacher sees Student Info Management page
    And  teacher clicks Choose Lesson
    And  teacher clicks Choose Student
    And  teacher clicks Choose Education Term
    And  teacher enters Absentee
    And  teacher enters Midterm Exam
    And  teacher enters Final Exam
    And  teacher enters Info Note
    And  tteacher clicks submit button
    And tteachers must see javascript pop-up message "'100.0' değerinden küçük yada eşit olmalı" message
    And  cclose driver