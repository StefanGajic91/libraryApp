package library.step_Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import library.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void tearDownScenario(Scenario scenario){

        //scenario.isFailed()   --> if scenario fails this method will return TRUE boolean value
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        // BrowserUtils.sleep(5);    // just so we can see the outcome before its closed
        Driver.closeDriver();


//      System.out.println("====Closing browser using cucumber @After");
//      System.out.println("====Scenario ended/ take screenshot if failed!");
    }
}
