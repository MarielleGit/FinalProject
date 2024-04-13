package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_17.StudentInfoExpectedDataPojo;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_17_StepDefs.studentInfoId;

public class US_17_DB_StepDefs {

    ResultSet resultSet;
    Statement statement;
    String query;

    StudentInfoExpectedDataPojo expectedData;
    Connection connection;
    @When("teacher sets connection US_17")
    public void teacherSetsConnectionUS_17() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }

    @And("teacher creates statement US_17")
    public void teacherCreatesStatementUS_17() throws SQLException {
        statement= connection.createStatement();

    }

    @And("teacher executes query for created meet US_17")
    public void teacherExecutesQueryForCreatedMeetUS_17() throws SQLException {
        query ="select * from student_info where id='"+studentInfoId+"'";
        resultSet = statement.executeQuery(query);
        System.out.println("resultSet = " + resultSet);
    }

    @Then("teacher validates result set US_17")
    public void teacherValidatesResultSetUS_17() throws SQLException {
        expectedData= new StudentInfoExpectedDataPojo(10,47,56,"hello world, this is a test",4451,40,3361);
        String expectedMidterm=String.valueOf(expectedData.getMidtermExam());
        String expectedfinalExam=String.valueOf(expectedData.getFinalExam());
        String expectedAbsentee=String.valueOf(expectedData.getAbsentee());
        String expectedLessonId=String.valueOf(expectedData.getLessonId());
        String expectedStudentId=String.valueOf(expectedData.getStudentId());
        String expectedEducationTermId=String.valueOf(expectedData.getEducationTermId());
        resultSet.next();
        assertEquals(expectedAbsentee,resultSet.getString("absentee"));
        assertEquals(expectedEducationTermId,resultSet.getString("education_term_id"));
        assertEquals(expectedfinalExam,resultSet.getString("final_exam")+".0");
        assertEquals(expectedData.getInfoNote(),resultSet.getString("info_note"));
        assertEquals(expectedLessonId,resultSet.getString("lesson_lesson_id"));
        assertEquals(expectedMidterm,resultSet.getString("midterm_exam")+".0");
        assertEquals(expectedStudentId,resultSet.getString("student_id"));
    }

    @And("teacher terminates connection US_17")
    public void teacherTerminatesConnectionUS_17() {

        DBUtils.closeConnection();
    }
}
