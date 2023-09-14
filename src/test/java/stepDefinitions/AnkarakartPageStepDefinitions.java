package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.AnkarakartPage;
import utilities.DriverFactory;
public class AnkarakartPageStepDefinitions {

    AnkarakartPage ankarakartPage = new AnkarakartPage(DriverFactory.getDriver());
    @Given("Click the add card button")
    public void clickTheAddCardButton() {
    }

    @Given("Add card number")
    public void addCardNumber() {
    }

    @Given("Add card title")
    public void addCardTitle() {
        
    }

    @Given("Choose card color")
    public void chooseCardColor() {

    }
}
