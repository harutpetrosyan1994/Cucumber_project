package stepsDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UserRegistrationSteps {

    @BeforeStep("@UserRegistration")
    public void beforeStep() {
        System.out.println("beforeStep in class");
    }

    @Given("User is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("user navigate ot registration page ");
    }

    @When("User enters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists();
        for (List<String> e : userList) {
            System.out.println(e);
        }
    }

    @Then("user registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("user registration  is successful");
    }

    @When("User enters following user details with columns")
    public void user_enters_following_user_details_with_columns(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps();
        for (Map<String, String> e : userMap) {
            System.out.println(e);
        }
    }


}
