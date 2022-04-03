package library.pages;

import library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user_count")
    public WebElement userCount;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersLink;

    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> columnNames;

    @FindBy(xpath = "//a[@id='navbarDropdown']//span")
    public WebElement accountName;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement librarySignDash;





}
