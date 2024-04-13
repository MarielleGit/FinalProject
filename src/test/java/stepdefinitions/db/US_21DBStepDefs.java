package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_21.StudentPostPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US_21DBStepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("User sets connection")
    public void userSetsConnection() throws SQLException {
       connection =  DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("User creates statement")
    public void userCreatesStatement() throws SQLException {
        statement = connection.createStatement();
    }

    @When("User executes query for created lesson")
    public void userExecutesQueryForCreatedLesson() throws SQLException {
        String query = "SELECT * FROM lesson where lesson_name = 'swordsmanship'";
        resultSet = statement.executeQuery(query);
    }

    @Then("validates result set")
    public void validatesResultSet() throws SQLException {
        resultSet.next();
        assertEquals("swordsmanship",resultSet.getString("lesson_name"));
    }

    @And("User terminates connection")
    public void userTerminatesConnection() throws SQLException {
        statement.close();
        connection.close();
    }
}
