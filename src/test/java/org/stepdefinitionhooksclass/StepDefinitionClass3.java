package org.stepdefinitionhooksclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjectmanager.PageObjectManager;
import org.pojoclasses.BookAHotelPojo;

import cucumber.api.java.en.When;

public class StepDefinitionClass3 extends BaseClass {

	static BookAHotelPojo bj;
	
	@When("User has to enter first name")
	public void user_has_to_enter_first_name() {
		
		bj = PageObjectManager.getbookahotelpojo();
		
		searchFill(bj.getFirst_name(),"santhamurthy");	   
	}
	@When("User has to enter last name")
	public void user_has_to_enter_last_name() {
		
		bj = PageObjectManager.getbookahotelpojo();

		searchFill(bj.getLast_name(),"kesavan");
	}
	@When("User has to enter address")
	public void user_has_to_enter_address() {

		bj = PageObjectManager.getbookahotelpojo();

		searchFill(bj.getAddress(),"coimbatore");
	}
	@When("User has to enter cerdit card number")
	public void user_has_to_enter_cerdit_card_number() {
		
		bj = PageObjectManager.getbookahotelpojo();

		searchFill(bj.getCc_num(),"1234567890123456");
	}
	@When("User has to enter {int} didgit CVV Number")
	public void user_has_to_enter_didgit_CVV_Number(Integer int1) {
		
		bj = PageObjectManager.getbookahotelpojo();
		
		searchFill(bj.getCc_cvv(),"1234");	
	}
	@When("User has to select credit card type")
	public void user_has_to_select_credit_card_type() {
		
		bj = PageObjectManager.getbookahotelpojo();
		
		WebElement cardtype = bj.getCc_type();
		txtSelect(cardtype, "VISA");
	}

	@When("User has to select expiry month")
	public void user_has_to_select_expiry_month() {
		
		bj = PageObjectManager.getbookahotelpojo();
		
		WebElement selectmonth = bj.getCc_exp_month();
		txtSelect(selectmonth, "May");
		
	}
	@When("User has to select expiry year")
	public void user_has_to_select_expiry_year() {
	    
		bj = PageObjectManager.getbookahotelpojo();
		
		WebElement selectyear = bj.getCc_exp_year();
		txtSelect(selectyear, "2018");
	}
	@When("User has to click on book now button")
	public void user_has_to_click_on_book_now_button() {
		
		bj = PageObjectManager.getbookahotelpojo();
		
		btnClick(bj.getBook_now());	
	}
	}












