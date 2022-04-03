package library.step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.pages.DashboardPage;
import library.pages.LoginPage;
import library.utilities.ConfigurationReader;
import library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
      loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("librarianUserName"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        loginPage.signInButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
       // wait.until(ExpectedConditions.visibilityOf(dashboardPage.librarySignDash));
  Assert.assertTrue(dashboardPage.librarySignDash.isDisplayed());


    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("studentUserName"));
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("studentPassword"));
        loginPage.signInButton.click();
    }


    @When("user enters librarian {string}")
    public void userEntersLibrarian(String username) {
        loginPage.inputUserName.sendKeys(username);

    }

    @When("user enters student {string}")
    public void userEntersStudent(String password) {
        loginPage.inputPassword.sendKeys(password);
        loginPage.signInButton.click();
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String password) {
        loginPage.inputUserName.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);
        loginPage.signInButton.click();
    }

    @And("there should be {string} users")
    public void thereShouldBeUsers(String expectedUserCount) {
        String actualCount = dashboardPage.userCount.getText();
        Assert.assertEquals(expectedUserCount, actualCount);

    }


}
