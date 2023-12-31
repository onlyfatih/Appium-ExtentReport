package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import base.BaseMethods;

public class HomePage extends BaseMethods {

    private static final Logger LOG = LogManager.getLogger(HomePage.class);

    By announcementsBtn = MobileBy.xpath("//android.widget.ImageView[@content-desc=\"alo\"]");

    By searchBusStop = MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Durak Ara\"]");


    public HomePage(AppiumDriver driver) {
    }
    public void clickAnnouncementsBtn () {
        try {
            getDriver().findElement(announcementsBtn).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("AnnouncementsBtn isn't displayed");
        }
        getDriver().findElement(announcementsBtn).click();
    }
    public void clickSearchBusStopBtn () {
        try {
            getDriver().findElement(searchBusStop).click();
        }
        catch (Exception e) {
            LOG.info("Search Bus Stop isn't click");
        }
    }
}
