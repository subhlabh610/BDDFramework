package stepdefs;


import factory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginStepdef {
    LoginPage loginPage = new LoginPage(DriverFactory.getDriverInstance());

        @Given("^user is on login page$")
        public void user_is_on_login_page() {

        }


}
