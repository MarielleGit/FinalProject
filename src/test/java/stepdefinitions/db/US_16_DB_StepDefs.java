

package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_16.ContactMesasgePostPojo;
import pojos.US_22_Pojos.AdminExpectedDataPojo;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.ui.US_22_StepDefs.*;

public class US_16_DB_StepDefs {


    ResultSet resultSet;
    Statement statement;
    String query;

    ContactMesasgePostPojo payload;
    Connection connection;
    @Given("User sets connection US_16")
    public void userSetsConnectionUS_16() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("User creates statement US_16")
    public void userCreatesStatementUS_16() throws SQLException {
        statement= connection.createStatement();
    }

    @When("User executes query for created meet US_16")
    public void userExecutesQueryForCreatedMeetUS_16() throws SQLException {
        query ="select * from contact_message where email='Kadıbaba@gmail.com'";
        resultSet = statement.executeQuery(query);
        System.out.println("resultSet = " + resultSet);


    }

    @Then("User validates result set US_16")
    public void userValidatesResultSetUS_16() throws SQLException {

        resultSet.next();
        payload=new ContactMesasgePostPojo("Kadıbaba@gmail.com","Message gönderilmiştir.","Kadı","Baba");
        assertEquals(payload.getMessage(),resultSet.getString("message"));
        assertEquals(payload.getEmail(),resultSet.getString("email"));
        assertEquals(payload.getSubject(),resultSet.getString("subject"));
        assertEquals(payload.getName(),resultSet.getString("name"));
    }

    @Then("User terminates connection US_16")
    public void userTerminatesConnectionUS_16() {

        DBUtils.closeConnection();
    }
}
