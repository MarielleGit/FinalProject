package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.US_08.US08LessonsPOSTPOJO;

import java.sql.*;

import static org.junit.Assert.assertEquals;


public class US_08DbStepDefs {
    Statement statement;
    Connection connection;
    US08LessonsPOSTPOJO payload;
ResultSet resultSet;

    @Given("User Set connection for vice dean")
    public void userSetConnectionForViceDean() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }
    @And("User creates statement for lesson")
    public void userCreatesStatementForLesson() throws SQLException {
        statement = connection.createStatement();
    }

    @When("User execute query for lessons")
    public void userExecuteQueryForLessons() throws SQLException {
        String query = "SELECT * FROM lesson where lesson_name='CPlus'";

        resultSet = statement.executeQuery(query);
    }

    @Then("validates result set for lessons")
    public void validatesResultSetForLessons() throws SQLException {
        resultSet.next();
         payload = new US08LessonsPOSTPOJO(true,5,"CPlus");
       assertEquals(payload.getCreditScore(),resultSet.getInt("credit_Score"));
        assertEquals(payload.isCompulsory(),resultSet.getBoolean("is_compulsory"));
        assertEquals(payload.getLessonName(),resultSet.getString("lesson_name"));

    }

    @And("User terminate connection for lessons")
    public void userTerminateConnectionForLessons() throws SQLException {
        // DBUtils.closeConnection();
        statement.close();
        connection.close();
    }


}
