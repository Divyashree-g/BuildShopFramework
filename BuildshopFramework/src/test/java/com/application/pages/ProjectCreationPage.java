package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectCreationPage {

	WebDriver driver;
	public ProjectCreationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='btnProjetstxt']")
	private WebElement projectDropDown;
	
	@FindBy(id="ctl00_btnAddProject")
	private WebElement addProjectLink;
	
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement addaProjectButton;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ddlProjectStatus")
	private WebElement projectStatusDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtProjectID")
	private WebElement projectNameTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtFirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtLastName")
	private WebElement lastNameTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_PhoneTextBox")
	private WebElement phoneNumTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ExtensionTextBox")
	private WebElement extensionTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_CellPhoneTextBox")
	private WebElement cellPhoneNumTextFiled;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_FaxTextBox")
	private WebElement faxTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_EmailTextBox")
	private WebElement emailIdTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_StreetTextBox")
	private WebElement streetAddressTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ddlCountries")
	private WebElement selCountry;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ddlStates")
	private WebElement selState;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ddlCities")
	private WebElement selCity;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ZipTextBox")
	private WebElement zipcode;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtLongitude")
	private WebElement longitude;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtLongitude")
	private WebElement latitude;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_WorkDescriptionTextBox")
	private WebElement workDesc;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_InsertButton")
	private WebElement save;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement done;
	
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement search;
	
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement searchButton;
	
	@FindBy(xpath="//span[text()='Test Yantra project']")
	private WebElement clickonaproject;
	
	@FindBy(xpath="//span[text()='Resources']")
	private WebElement resources;
	
	@FindBy(id="ctl00_MainContent_Tabs_TabPanel2_FormViewResources_hylProjectProjects")
	private WebElement addemp;
	
	@FindBy(id="ctl00_MainContent_Tabs_TabPanel2_FormViewResources_GridViewUsers_ctl08_btnUserName")
	private WebElement selemps;
	
	//Modified Now
	
}
