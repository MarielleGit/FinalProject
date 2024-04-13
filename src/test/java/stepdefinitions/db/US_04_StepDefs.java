package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.Us4_5.ObjectPojo;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_04_StepDefs.userId;


public class US_04_StepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    ObjectPojo objectPojo;
    @Given("User sets connection serife")
    public void userSetsConnectionSerife() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }
    @And("User creates statement serife")
    public void userCreatesStatementSerife() throws SQLException {
        statement = connection.createStatement();
    }

    @When("User executes query for created dean serife")
    public void userExecutesQueryForCreatedDeanSerife() throws SQLException {
        String query = "SELECT * FROM dean where username = 'AliCancan'";
        resultSet = statement.executeQuery(query);
    }

    @Then("validates result set serife")
    public void validatesResultSetSerife() throws SQLException {
        resultSet.next();
        objectPojo = new ObjectPojo(userId, "AliCancan", "Ali", "Can", "1990-09-24", "882-22-2881", "TR", "226-662-2261", "MALE");
        assertEquals(objectPojo.getUsername(), resultSet.getString("username"));
        assertEquals(objectPojo.getName(), resultSet.getString("name"));
        assertEquals(objectPojo.getSurname(), resultSet.getString("surname"));
        assertEquals(objectPojo.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(objectPojo.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(objectPojo.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(objectPojo.getSsn(), resultSet.getString("ssn"));
        assertEquals(0, resultSet.getInt("gender"));

    }
    @And("terminate connection serife")
    public void terminateConnectionSerife() {
        DBUtils.closeConnection();
    }
}
