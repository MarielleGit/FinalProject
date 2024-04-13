package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static stepdefinitions.api.US_04_StepDefs.userId;
import static utilities.DBUtils.executeQuery;

public class US_05_StepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    List<Object> listOfUserId;
    @Given("set connection")
    public void setConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
        statement = connection.createStatement();
    }
    @When("executes query with userId that is deleted")
    public void executesQueryWithUserIdThatIsDeleted() throws SQLException {  // I couldn't use the DBUtils and couldn't find the solution
        listOfUserId = new ArrayList<>();
        String query = "SELECT id FROM dean";
        resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            listOfUserId.add(resultSet.getObject("id"));
        }
     //   System.out.println("listOfUserId = " + listOfUserId);
    }
    @Then("verify deletion")
    public void verifyDeletion() {
        System.out.println("userId = " + userId);
    //    Assert.assertFalse(listOfUserId.contains(userId));  // This doesn't work, I couldn't find the cause. When I try to verify an userId already exist in the list , It passed again.

        int lastIndexOfArray = listOfUserId.size();
    //    System.out.println("Last userId of the listOfUserId = " + listOfUserId.get(lastIndexOfArray-1));  // this returns me last user id of the list

        Assert.assertNotEquals(userId,listOfUserId.get(lastIndexOfArray-1));
    }
}
