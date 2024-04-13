package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_06.US_06ObjectPojo;
import pojos.US_06.US_06ViceDeanPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_06StepDefs.userId;


public class US_06DBStepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    US_06ViceDeanPojo expectedData;
    US_06ObjectPojo innerJson;
    @Given("User Set connection for US_06")
    public void userSetConnectionForUs_06() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("User creates statement for US_06")
    public void userCreatesStatementForUS_06() throws SQLException {
        statement = connection.createStatement();
    }

    @When("User execute query for created vice dean for US_06")
    public void userExecuteQueryForCreatedViceDean() throws SQLException {
        String query = "SELECT * FROM vice_dean where username = 'ViceDean1000'";
        resultSet = statement.executeQuery(query);
    }

    @Then("validates result set for US_06")
    public void validatesResultSetForUS_06() throws SQLException {
        resultSet.next();

        innerJson = new US_06ObjectPojo("1990-10-10","Ankara" ,"445-412-1039", "MALE", "last","Naim",userId, "ViceDean1000","695-11-2039");

        assertEquals(innerJson.getUsername(),resultSet.getString("username"));
        assertEquals(innerJson.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(innerJson.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(0,resultSet.getInt("gender"));
        assertEquals(innerJson.getName(),resultSet.getString("name"));
        assertEquals(innerJson.getSsn(),resultSet.getString("ssn"));
        assertEquals(innerJson.getSurname(),resultSet.getString("surname"));
        assertEquals(innerJson.getPhoneNumber(),resultSet.getString("phone_number"));

    }

    @And("User terminate connection for US_06")
    public void userTerminateConnectionForUS_06() throws SQLException {
        statement.close();
        connection.close();
    }
}
