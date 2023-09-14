package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AnnouncementsPage;
import utilities.DriverFactory;

public class AnnouncementsPageStepDefinitions {

    AnnouncementsPage announcementsPage = new AnnouncementsPage(DriverFactory.getDriver());
    @Then("Verify Announcements post")
    public void verifyAnnouncementsPost() {
        announcementsPage.displayedAnnouncements();
    }
}
