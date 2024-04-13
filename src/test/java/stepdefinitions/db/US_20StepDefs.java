package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_19.MeetPostpojo;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_19_StepDefs.description;
import static stepdefinitions.api.US_19_StepDefs.studentId;
import static stepdefinitions.api.US_20_StepDefs.date;

public class US_20StepDefs {

    ResultSet resultSet;
    Statement statement;
    String query;
    Connection connection;

    MeetPostpojo payload;
    @Given("User sets connection US_20")
    public void userSetsConnectionUS_20() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("User creates statement US_20")
    public void userCreatesStatementUS_20() throws SQLException {
        statement = connection.createStatement();
    }

    @When("User executes query for updated meet US_20")
    public void userExecutesQueryForUpdatedMeetUS_20() throws SQLException {
        query ="select * from meet where description = '"+description+"'";
        resultSet = statement.executeQuery(query);
        System.out.println("resultSet = " + resultSet);
    }

    @Then("User validates result set US_20")
    public void userValidatesResultSetUS_20() throws SQLException {

        resultSet.next();
        payload = new MeetPostpojo(date, description, "13:00:00", "14:00:00",studentId);
        assertEquals(payload.getDate(),resultSet.getString("date"));
        assertEquals(payload.getDescription(),resultSet.getString("description"));
        assertEquals(payload.getStartTime(),resultSet.getString("start_time"));
        assertEquals(payload.getStopTime(),resultSet.getString("stop_time"));
        //assertEquals(payload.getStudentIds(),resultSet.getString("id"));
    }

    @Then("User terminates connection US_20")
    public void userTerminatesConnectionUS_20() {
        DBUtils.closeConnection();

    }
}
