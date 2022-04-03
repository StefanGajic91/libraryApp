package library.pages;

import library.utilities.ConfigurationReader;
import library.utilities.Driver;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "inputEmail")
        public WebElement inputUserName;


    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

public void librarianLogin(){
    inputUserName.sendKeys(ConfigurationReader.getProperty("librarianUserName"));
    inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
    signInButton.click();
}

@FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboard;

}