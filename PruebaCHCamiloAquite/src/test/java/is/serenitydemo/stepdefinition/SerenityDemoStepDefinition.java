package is.serenitydemo.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import is.serenitydemo.model.SerenityDemoModel;
import is.serenitydemo.page.SerenityDemoPage;
import is.serenitydemo.setup.WebUI;
import org.junit.jupiter.api.Assertions;

public class SerenityDemoStepDefinition extends WebUI {

    private SerenityDemoModel cliente;

    @Given("User is in demoserenity")
    public void userIsInDemoserenity() {
        generalSetup();
        generarUsuario();
        SerenityDemoPage serenityDemoPage = new SerenityDemoPage(cliente, super.driver);
        serenityDemoPage.login();
    }

    @When("User create the meeting")
    public void userCreateTheMeeting() {
        SerenityDemoPage serenityDemoPage = new SerenityDemoPage(cliente, super.driver);
        serenityDemoPage.createNewMeeting();
    }

    @Then("The user can successfully create the meeting")
    public void theUserCanSuccessfullyCreateTheMeeting() {
        SerenityDemoPage serenityDemoPage = new SerenityDemoPage(cliente, super.driver);
        Assertions.assertEquals("1Reunion_Camilo", serenityDemoPage.checkMeetingName());
        quitDrive();
    }

    @When("user create a business unit")
    public void userCreateABusinessUnit() {
        generarBusiness();
        SerenityDemoPage serenityDemoPage = new SerenityDemoPage(cliente, super.driver);
        serenityDemoPage.enterbusinessUnit();
    }

    @Then("The user can select the business unit")
    public void theUserCanSelectTheBusinessUnit() {
        SerenityDemoPage serenityDemoPage = new SerenityDemoPage(cliente, super.driver);
        Assertions.assertEquals("1Camilo Unit", serenityDemoPage.checkBusinessUnit());
        quitDrive();
    }

    private void generarUsuario() {
        cliente = new SerenityDemoModel();
        cliente.setUser("admin");
        cliente.setPassword("serenity");
        cliente.setMeetingName("1Reunion_Camilo");
        cliente.setTextBoxMeetingType("Strategy");
        cliente.setMeetingNumber("130699");
        cliente.setStartDayDateMeeting("03/22/23");
        cliente.setEndDateMeeting("03/22/23");
        cliente.setTextBoxLocationMeeting("SD-01");
        cliente.setTextBoxUnitMeeting("Administration");
        cliente.setTextBoxOrganizedByMeeting("Eleanor Hughes");
        cliente.setTextBoxReporterMeeting("James Jones");
        cliente.setTextBoxAttendeeList("Allison Bell");
    }

    private void generarBusiness() {
        cliente = new SerenityDemoModel();
        cliente.setNameNewBusinessUnit("1Camilo Unit");
    }
}