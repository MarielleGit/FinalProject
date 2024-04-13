package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_22_Pojos.AdminExpectedDataPojo;
import utilities.DBUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.ui.US_22_StepDefs.*;

public class US_22_DB_StepDefs {
    AdminExpectedDataPojo adminExpectedData;
    ResultSet resultSet;
    Statement statement;
    String query;
    Connection connection;
    @When("User executes query for created admin")
    public void userExecutesQueryForCreatedAdmin() throws SQLException {
        query ="select * from admins where username='"+Adminusername+"'";
        resultSet = statement.executeQuery(query);
        System.out.println("resultSet = " + resultSet);
    }

    @Then("validates result set for admin")
    public void validatesResultSetForAdmin() throws SQLException {
        resultSet.next();
        adminExpectedData= new AdminExpectedDataPojo("2000-01-01","Kabul",true,"0","Hekmat","Hekmat123",Adminphonenumber,Adminssn,"Amini",Adminusername);
        assertEquals(adminExpectedData.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(adminExpectedData.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(adminExpectedData.getGender(),resultSet.getString("gender"));
        assertEquals(adminExpectedData.getName(),resultSet.getString("name"));
        assertEquals(adminExpectedData.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(adminExpectedData.getSsn(),resultSet.getString("ssn"));
        assertEquals(adminExpectedData.getSurname(),resultSet.getString("surname"));
        assertEquals(adminExpectedData.getUsername(),resultSet.getString("username"));
    }

    @Given("User sets connection for admin")
    public void userSetsConnectionForAdmin() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }

    @And("User creates statement for admin")
    public void userCreatesStatementForAdmin() throws SQLException {
        statement= connection.createStatement();

    }

    @And("User terminates connection for admin")
    public void userTerminatesConnectionForAdmin() {

        DBUtils.closeConnection();
    }
}
