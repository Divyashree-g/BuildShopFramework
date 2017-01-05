package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='hpmenu']/..//a[@class='headerLinksHP']")
	private WebElement welcomePageSignInLink;
	   
	@FindBy (id="ctl00_ContentPlaceHolder1_Login101_UserName")
	private WebElement usernameTextField;

	@FindBy (id="ctl00_ContentPlaceHolder1_Login101_Password")
	private WebElement passwordTextField;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_Login101_Submit2")
	private WebElement loginPageSignInButton;
		  
	public void loginToApplication()
	{
		welcomePageSignInLink.click();
		usernameTextField.sendKeys("Bill Thomas");
		passwordTextField.sendKeys("Bill1234");
		loginPageSignInButton.click();
		
		
	}
	
	
