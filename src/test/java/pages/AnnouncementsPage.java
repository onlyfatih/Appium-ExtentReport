package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import base.BaseMethods;
public class AnnouncementsPage extends BaseMethods {

    private static final Logger LOG = LogManager.getLogger(AnnouncementsPage.class);

    By announcementsTitle = MobileBy.xpath("//android.view.View[@content-desc=\"Duyurular\" and @index= 1]");

    public AnnouncementsPage(AppiumDriver driver) {
    }

    public void displayedAnnouncements () {
        try {
            getDriver().findElement(announcementsTitle).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Announcements Title is not displayed");
        }
    }
}
