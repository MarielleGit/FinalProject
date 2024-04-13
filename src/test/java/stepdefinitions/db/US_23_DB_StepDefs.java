package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_22_Pojos.AdminExpectedDataPojo;
import pojos.US_23_Pojos.ViceDeanExpectedDataPojo;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.ui.US_22_StepDefs.*;
import static stepdefinitions.ui.US_23_StepDefs.*;

public class US_23_DB_StepDefs {

    ResultSet resultSet;
    Statement statement;
    String query;
    Connection connection;
    ViceDeanExpectedDataPojo viceDeanExpectedData;

    @Given("User sets connection for vice dean")
    public void userSetsConnectionForViceDean() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }

    @And("User creates statement for vice dean")
    public void userCreatesStatementForViceDean() throws SQLException {
        statement= connection.createStatement();

    }

    @When("User executes query for created vice dean")
    public void userExecutesQueryForCreatedViceDean() throws SQLException {
        query ="select * from vice_dean where username='"+vicedeanUsername+"'";
        resultSet = statement.executeQuery(query);
        System.out.println("resultSet = " + resultSet);
    }

    @Then("validates result set for vice dean")
    public void validatesResultSetForViceDean() throws SQLException {
        resultSet.next();
        viceDeanExpectedData= new ViceDeanExpectedDataPojo("2000-01-01","Kabul","0","Hekmat","Hekmat123",vicedeanphoneNumber,vicedeanSsn,"Amini",vicedeanUsername);
        assertEquals(viceDeanExpectedData.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(viceDeanExpectedData.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(viceDeanExpectedData.getGender(),resultSet.getString("gender"));
        assertEquals(viceDeanExpectedData.getName(),resultSet.getString("name"));
        assertEquals(viceDeanExpectedData.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(viceDeanExpectedData.getSsn(),resultSet.getString("ssn"));
        assertEquals(viceDeanExpectedData.getSurname(),resultSet.getString("surname"));
        assertEquals(viceDeanExpectedData.getUsername(),resultSet.getString("username"));
    }

    @And("User terminates connection for vice dean")
    public void userTerminatesConnectionForViceDean() {
        DBUtils.closeConnection();
    }
}
