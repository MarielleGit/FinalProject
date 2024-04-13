package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_19.MeetPostpojo;
import pojos.US_22_Pojos.AdminExpectedDataPojo;
import utilities.DBUtils;

import java.sql.*;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_19_StepDefs.studentId;
import static stepdefinitions.api.US_19_StepDefs.description;

public class US_19_StepDefs {


    ResultSet resultSet;
    Statement statement;
    String query;
    Connection connection;

    MeetPostpojo payload;
    @Given("User sets connection US_19")
    public void userSetsConnectionUS_19() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }

    @And("User creates statement US_19")
    public void userCreatesStatementUS_19() throws SQLException {
        statement = connection.createStatement();
    }

    @When("User executes query for created meet US_19")
    public void userExecutesQueryForCreatedMeetUS_19() throws SQLException {
        query ="select * from meet where description = '"+description+"'";
        resultSet = statement.executeQuery(query);
        System.out.println("resultSet = " + resultSet);
    }

    @Then("User validates result set US_19")
    public void userValidatesResultSetUS_19() throws SQLException {

        resultSet.next();
        payload = new MeetPostpojo("2025-01-24", description, "13:00:00", "14:00:00",studentId);
        assertEquals(payload.getDate(),resultSet.getString("date"));
        assertEquals(payload.getDescription(),resultSet.getString("description"));
        assertEquals(payload.getStartTime(),resultSet.getString("start_time"));
        assertEquals(payload.getStopTime(),resultSet.getString("stop_time"));
        //assertEquals(payload.getStudentIds(),resultSet.getString("id"));
    }

    @Then("User terminates connection US_19")
    public void userTerminatesConnectionUS_19() {
        DBUtils.closeConnection();
    }
}
