package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_07.US07ContactMessagesPOSTPOJO;

import java.sql.*;

import static org.junit.Assert.assertEquals;


public class US_07DbStepDefs {
    Statement statement;
    ResultSet resultSet;
    Connection connection;
    US07ContactMessagesPOSTPOJO payload;
    @Given("User Set connection for contact message for US_07")
    public void userSetConnectionForContactMessageForUS_07() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }

    @And("User creates statement for contact message for US_07")
    public void userCreatesStatementForContactMessageForUs_07() throws SQLException {
        statement= connection.createStatement();

    }
    @When("User execute query for created messages for US_07")
    public void userExecuteQueryForCreatedMessagesForUs_07() throws SQLException {
        String query = "SELECT * FROM contact_message where email='vicedean@vicedean.com'";
        resultSet = statement.executeQuery(query);
    }

    @Then("validates result set for contact message for US_07")
    public void validatesResultSetForContactMessageForUs_07() throws SQLException {
        resultSet.next();
        payload = new US07ContactMessagesPOSTPOJO("vicedean@vicedean.com","manegement issue","manager","school");
        assertEquals(payload.getMessage(),resultSet.getString("message"));
        assertEquals(payload.getName(),resultSet.getString("name"));
        assertEquals(payload.getEmail(),resultSet.getString("email"));
        assertEquals(payload.getSubject(),resultSet.getString("subject"));
    }

    @And("User terminate connection for contact message for US_07")
    public void userTerminateConnectionForContactMessageForUs_07() throws SQLException {
// DBUtils.closeConnection();
        statement.close();
        connection.close();
    }
}
