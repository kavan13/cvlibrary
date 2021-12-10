package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']" )
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsButton;

    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;


    public void enterJobTitle(String jobTitle1){
        sendTextToElement(jobTitle, jobTitle1);
        CustomListeners.node.log(Status.PASS, "Search '" + jobTitle1 + "' jobTitle1");
        Reporter.log("Enter Job Title" +jobTitle+"to Job title field" +jobTitle.toString() + "<br>");

    }
    public void enterLocation(String Location){
        sendTextToElement(location, Location);
        CustomListeners.node.log(Status.PASS, "Search '" + Location + "' City");

        Reporter.log("Enter Location" + Location+"to Location field"+ location.toString() + "<br>");

    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
        CustomListeners.node.log(Status.PASS, "Search '" + distance + "' Miles");

        Reporter.log("Select Distance" + location.toString() + "<br>");

    }
    public  void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionLink);
        CustomListeners.node.log(Status.PASS, "Click on more search option");

        Reporter.log("click on More Search Option" + moreSearchOptionLink.toString() + "<br>");

    }
    public  void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);
        CustomListeners.node.log(Status.PASS, "Search '" + minSalary + "' Salary");

        Reporter.log("Enter Salary " + minSalary+ " to salary field " + salaryMin.toString() + "<br>");

    }
    public  void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
        CustomListeners.node.log(Status.PASS, "Search '" + maxSalary + "' Salary");

        Reporter.log("Enter Salary " + maxSalary+ " to salary field " + salaryMax.toString() + "<br>");

    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        CustomListeners.node.log(Status.PASS, "Search '" + sType + "' Per annum");

        Reporter.log("Select Salary Type" + salaryTypeDropDown.toString() + "<br>");

    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        CustomListeners.node.log(Status.PASS, "Search '" + jobType + "' Permanent");

        Reporter.log("Select Job Type" + salaryTypeDropDown.toString() + "<br>");

    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsButton);
        CustomListeners.node.log(Status.PASS, "Click on Find Jobs Button");

        Reporter.log("click on Find Job Button"  + findJobsButton.toString() + "<br>");

    }
    public void setAcceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }


}
