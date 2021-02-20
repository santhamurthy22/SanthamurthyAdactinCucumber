package org.stepdefinitionhooksclass;

import org.baseclass.BaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.pojoclasses.LoginPojo;

import cucumber.api.java.en.When;

public class StepDefinitionClass  extends BaseClass{
	
	       static LoginPojo f;   
	       
	@When("User has to enter the lanuch broeser and url")
	public void user_has_to_enter_the_lanuch_broeser_and_url() {
		lanuchBrowser();
		lanuchUrl("https://adactinhotelapp.com/");
	}

	@When("User has to enter the password and password")
	public void user_has_to_enter_the_password_and_password() {

		f = PageObjectManager.getloginpojo();
		
		searchFill(f.getUsername(),"santhamurthy");
		searchFill(f.getPassword(),"santhamurthy");	
	}
	@When("User has to click the submit button")
	public void user_has_to_click_the_submit_button() {
		
		f = PageObjectManager.getloginpojo();
		
	     btnClick(f.getLogin());		   
	}
	}
