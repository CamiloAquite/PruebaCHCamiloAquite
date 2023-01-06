package is.serenitydemo.page;

import is.serenitydemo.model.SerenityDemoModel;
import is.serenitydemo.page.common.CommonActionOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SerenityDemoPage extends CommonActionOnPages {


    private final SerenityDemoModel serenityDemoModel;

    public SerenityDemoPage(SerenityDemoModel serenityDemoModel, WebDriver webDriver) {
        super(webDriver);
        this.serenityDemoModel = serenityDemoModel;
    }


    //Locators
    private final By userNameLocator = By.id("LoginPanel0_Username");
    private final By password = By.id("LoginPanel0_Password");
    private final By buttonSignInLocator = By.id("LoginPanel0_LoginButton");
    private final By buttonMeeting = By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a/span");
    private final By buttonMeetingSubMenu = By.xpath("//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span");
    private final By createMeeting = By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");
    private final By meetingNameLocator = By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName");
    private final By meetingType = By.id("select2-chosen-6");
    private final By textBoxMeetingType = By.id("s2id_autogen6_search");
    private final By meetingNumber = By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber");
    private final By clockBegin = By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/i/b");
    private final By startDayDateMeeting = By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate");
    private final By endDateMeeting = By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate");
    private final By locationMeeting = By.id("select2-chosen-7");
    private final By textBoxLocationMeeting = By.id("s2id_autogen7_search");
    private final By unitMeeting = By.id("select2-chosen-8");
    private final By textBoxUnitMeeting = By.id("s2id_autogen8_search");
    private final By organizedByMeeting = By.id("select2-chosen-9");
    private final By textBoxOrganizedByMeeting = By.id("s2id_autogen9_search");
    private final By reporterMeeting = By.id("select2-chosen-10");
    private final By textBoxReporterMeeting = By.id("s2id_autogen10_search");
    private final By attendeeList = By.id("select2-chosen-12");
    private final By textBoxAttendeeList = By.id("s2id_autogen12_search");
    private final By buttonSaveMeeting = By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_Toolbar\"]/div/div/div/div[1]/div/span");
    private final By textAssertionMeetingName = By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[2]/a");
    private final By organizationMenuBusiness = By.xpath("//*[@id=\"nav_menu1_3\"]/li[1]/a/span");
    private final By buttonBusinessUnits = By.xpath("//*[@id=\"nav_menu1_3_1\"]/li[1]/a/span");
    private final By buttonNewBusinessesUnit = By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span/i");
    private final By nameNewBusinessUnit = By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]");
    private final By buttonSaveBusiness = By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[1]/div/span");
    private final By textBoxSearchBusinessUnit = By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[1]/input");
    private final By textAssertionBusinessUnit = By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[2]");


    //Scenario 1

    public void login() {
        enterUserName();
        enterPassword();
        clickButtonSignIn();

    }

    public void createNewMeeting() {
        clickMeeting();
        fillFormMeeting();

    }

    public void enterUserName() {
        click(userNameLocator);
        clearText(userNameLocator);
        typeInto(userNameLocator, serenityDemoModel.getUser());
    }

    public void enterPassword() {
        click(password);
        clearText(password);
        typeInto(password, serenityDemoModel.getPassword());

    }

    public void clickButtonSignIn() {
        waitClick(buttonSignInLocator);
    }

    public void clickMeeting() {
        waitToBeClickable(buttonMeeting);
        click(buttonMeeting);
        click(buttonMeetingSubMenu);
        click(createMeeting);
    }

    public void fillFormMeeting() {
        click(meetingNameLocator);
        typeInto(meetingNameLocator, serenityDemoModel.getMeetingName());

        click(meetingType);
        typeInto(textBoxMeetingType, serenityDemoModel.getTextBoxMeetingType());
        pressEnter(textBoxMeetingType);

        click(meetingNumber);
        typeInto(meetingNumber, serenityDemoModel.getMeetingNumber());

        click(clockBegin);

        click(startDayDateMeeting);
        clearText(startDayDateMeeting);
        typeInto(startDayDateMeeting, serenityDemoModel.getStartDayDateMeeting());

        click(endDateMeeting);
        clearText(endDateMeeting);
        typeInto(endDateMeeting, serenityDemoModel.getEndDateMeeting());

        click(locationMeeting);
        typeInto(textBoxLocationMeeting, serenityDemoModel.getTextBoxLocationMeeting());
        pressEnter(textBoxLocationMeeting);

        click(unitMeeting);
        typeInto(textBoxUnitMeeting, serenityDemoModel.getTextBoxUnitMeeting());
        pressEnter(textBoxUnitMeeting);

        click(organizedByMeeting);
        typeInto(textBoxOrganizedByMeeting, serenityDemoModel.getTextBoxOrganizedByMeeting());
        pressEnter(textBoxOrganizedByMeeting);

        click(reporterMeeting);
        typeInto(textBoxReporterMeeting, serenityDemoModel.getTextBoxReporterMeeting());
        pressEnter(textBoxReporterMeeting);

        click(attendeeList);
        typeInto(textBoxAttendeeList, serenityDemoModel.getTextBoxAttendeeList());
        pressEnter(textBoxAttendeeList);

        click(buttonSaveMeeting);

        waitToBeClickable(textAssertionMeetingName);
    }


    public void enterbusinessUnit() {

        waitToBeClickable(organizationMenuBusiness);
        click(organizationMenuBusiness);

        click(buttonBusinessUnits);

        waitClick(buttonNewBusinessesUnit);

        typeInto(nameNewBusinessUnit, serenityDemoModel.getNameNewBusinessUnit());


        click(buttonSaveBusiness);

        waitClick(textBoxSearchBusinessUnit);
        typeInto(textBoxSearchBusinessUnit, serenityDemoModel.getNameNewBusinessUnit());
        pressEnter(textBoxSearchBusinessUnit);

        waitToBeClickable(textAssertionBusinessUnit);
    }

    public String checkMeetingName() {
        return getText(textAssertionMeetingName);
    }

    public String checkBusinessUnit() {
        return getText(textAssertionBusinessUnit);
    }

}