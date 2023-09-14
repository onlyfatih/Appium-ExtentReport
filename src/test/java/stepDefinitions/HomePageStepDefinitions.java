package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import utilities.DriverFactory;

public class HomePageStepDefinitions {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    //String screenshotdir = System.getProperty("user.dir") + "/ExtentReport/Screenshots/";
    @Given("Click the Announcements button")
    public void clickTheAnnouncementsButton() {
        homePage.clickAnnouncementsBtn();
    }

    @Given("Click the Durak Ara button")
    public void clickTheDurakAraButton() {
        homePage.clickSearchBusStopBtn();
    }
}
