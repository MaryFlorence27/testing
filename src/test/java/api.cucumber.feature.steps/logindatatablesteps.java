package api.cucumber.feature.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class logindatatablesteps {
    @Given("User is at the login page of the application")
    public void userIsAtTheLoginPageOfTheApplication() {
        System.out.println("userIsAtTheLoginPageOfTheApplication ");
        System.out.println("modified the code");
    }

    @When("User logs in with following username and password")
    public void userLogsInWithFollowingUsernameAndPassword(DataTable dataTable) {
        List<List<String>>list_of_rows=dataTable.asLists();
        for(List<String>row:list_of_rows){
            for(String str:row){
                System.out.println("Data : "+str);
            }
        }

    }

    @Then("User should be able to login with correct username and password")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() {
        System.out.println("userShouldBeAbleToLoginWithCorrectUsernameAndPassword");
    }
}
