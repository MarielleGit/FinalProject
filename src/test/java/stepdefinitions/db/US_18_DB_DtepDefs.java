package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_17.StudentInfoExpectedDataPojo;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_17_StepDefs.studentInfoId;

public class US_18_DB_DtepDefs {
    ResultSet resultSet;
    Statement statement;
    String query;

    StudentInfoExpectedDataPojo updatedData;
    Connection connection;

    @When("teacher sets connection US_18")
    public void teacherSetsConnectionUS_18() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }

    @And("teacher creates statement US_18")
    public void teacherCreatesStatementUS_18() throws SQLException {
        statement= connection.createStatement();

    }

    @And("teacher executes query for created meet US_18")
    public void teacherExecutesQueryForCreatedMeetUS_18() throws SQLException {
        query ="select * from student_info where id='"+studentInfoId+"'";
        resultSet = statement.executeQuery(query);
        System.out.println("resultSet = " + resultSet);
    }

    @Then("teacher validates result set US_18")
    public void teacherValidatesResultSetUS_18() throws SQLException {
        updatedData= new StudentInfoExpectedDataPojo(10,47,79.0,"hello world, this is a test",4451,40.0,3361);
        String updatedMidterm=String.valueOf(updatedData.getMidtermExam());
        String updatedfinalExam=String.valueOf(updatedData.getFinalExam());
        String updatedAbsentee=String.valueOf(updatedData.getAbsentee());
        String updatedLessonId=String.valueOf(updatedData.getLessonId());
        String updatedStudentId=String.valueOf(updatedData.getStudentId());
        String updatedEducationTermId=String.valueOf(updatedData.getEducationTermId());
        resultSet.next();
        assertEquals(updatedAbsentee,resultSet.getString("absentee"));
        assertEquals(updatedEducationTermId,resultSet.getString("education_term_id"));
        assertEquals(updatedfinalExam,resultSet.getString("final_exam")+".0");
        assertEquals(updatedData.getInfoNote(),resultSet.getString("info_note"));
        assertEquals(updatedLessonId,resultSet.getString("lesson_lesson_id"));
        assertEquals(updatedMidterm,resultSet.getString("midterm_exam")+".0");
        assertEquals(updatedStudentId,resultSet.getString("student_id"));
    }

    @And("teacher terminates connection US_18")
    public void teacherTerminatesConnectionUS_18() {
        DBUtils.closeConnection();
    }
}
