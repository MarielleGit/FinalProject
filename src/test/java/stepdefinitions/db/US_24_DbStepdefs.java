package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pojos.Us24_25.US_24.Expectedpojo;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.*;
import static stepdefinitions.api.Us_24_Stepdefs.userId;

public class US_24_DbStepdefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    Expectedpojo expectedData;


    @Given("User sets connection teacher")
    public void userSetsConnectionTeacher() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("User creates statement teacher")
    public void userCreatesStatementTeacher() throws SQLException {
        statement= connection.createStatement();

    }

    @When("User executes query for created teacher")
    public void userExecutesQueryForCreatedTeacher() throws SQLException {
        String query ="select * from teacher where name='namık'";
       resultSet = statement.executeQuery(query);
        System.out.println("resultSet = " + resultSet);
    }

    @Then("validates result set teacher")
    public void validatesResultSetTeacher() throws SQLException {
        resultSet.next();
        expectedData = new Expectedpojo("2013-01-01", "Urfa", "NMkk@gmail.com", "0", true, "namık", "Namıkk197", "639-677-3233", "639-77-5399", "Selimm", "Namıkok");
        assertEquals(expectedData.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(expectedData.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(expectedData.getGender(),resultSet.getString("gender"));
        assertEquals(expectedData.getName(),resultSet.getString("name"));
        assertEquals(expectedData.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(expectedData.getSsn(),resultSet.getString("ssn"));
        assertEquals(expectedData.getSurname(),resultSet.getString("surname"));
        assertEquals(expectedData.getUsername(),resultSet.getString("username"));
        assertEquals(expectedData.getEmail(),resultSet.getString("email"));
        assertEquals(expectedData.isIsAdvisorTeacher(),resultSet.getBoolean("is_advisor"));
//        assertEquals(userId,resultSet.getInt("id"));

    }

    @And("User terminates connection teacher")
    public void userTerminatesConnectionTeacher() {
        DBUtils.closeConnection();

    }
}
