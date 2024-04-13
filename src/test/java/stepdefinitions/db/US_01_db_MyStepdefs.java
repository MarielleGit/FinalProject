package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pojos.US_01.ObjectInner;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_01_Stepdefs.userId;
import static stepdefinitions.api.US_01_Stepdefs.username;

public class US_01_db_MyStepdefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    ObjectInner objectInner;


    @Given("User sets connection for guest user")
    public void userSetsConnectionforguestuser() throws SQLException {
        connection =  DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("User creates statement for guest user")
    public void userCreatesStatementForGuestUser() throws SQLException {
        statement = connection.createStatement();
    }

    @When("User executes query for created email")
    public void userExecutesQueryForCreatedEmail() throws SQLException {
        String query = "select * from guest_user where username ='"+username+"'";
        resultSet = statement.executeQuery(query);

    }

    @Then("user validates result set for guest user")
    public void uservalidatesResultSetforguestuser() throws SQLException {
        resultSet.next();
        objectInner = new ObjectInner(userId, "Johndoe", "John", "Doe", "1978-07-06", "456-89-8569", "New york", "171-569-5896", "MALE");



        assertEquals(objectInner.getSsn(), resultSet.getString("ssn"));
        assertEquals(objectInner.getUsername(), resultSet.getString("username"));
        assertEquals(objectInner.getSurname(), resultSet.getString("surname"));
        assertEquals(objectInner.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(0, resultSet.getInt("gender"));
        assertEquals(objectInner.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(objectInner.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(objectInner.getName(), resultSet.getString("name"));


    }

    @And("User terminates connection for guest user")
    public void userTerminatesConnectionforguestuser() throws SQLException {

        DBUtils.closeConnection();

    }
}
