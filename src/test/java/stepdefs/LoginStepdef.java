package stepdefs;



import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pages.LoginPage;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class LoginStepdef {
    LoginPage loginPage = new LoginPage(DriverFactory.getDriverInstance());

        @Given("^user is on login page$")
        public void user_is_on_login_page(DataTable userCredData) {
            List<Map<String,String>> userCred = userCredData.asMaps(String.class,String.class);
            loginPage.loginToApplication(userCred.get(0).get("UserName"),userCred.get(0).get("Password"));
        }


}
