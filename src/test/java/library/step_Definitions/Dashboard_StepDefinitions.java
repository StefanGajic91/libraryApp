package library.step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import library.pages.DashboardPage;
import library.pages.LoginPage;
import library.utilities.BrowserUtils;
import library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Dashboard_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @And("I login as a librarian")
    public void iLoginAsALibrarian() {
loginPage.librarianLogin();

    }

    @And("I click on Users link")
    public void iClickOnUsersLink() {
        dashboardPage.usersLink.click();
    }


    @Then("table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String> expectedColumnNames) {
        List<String> actualColumnNames = BrowserUtils.getElementsText( dashboardPage.columnNames);
                Assert.assertEquals(expectedColumnNames,actualColumnNames );



    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String expectedName) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.accountName));
        String actualName = dashboardPage.accountName.getText();
       // System.out.println("actualName = " + actualName);
          Assert.assertEquals(expectedName, actualName);

    }


}
