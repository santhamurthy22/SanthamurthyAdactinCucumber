package org.stepdefinitionhooksclass;

import org.baseclass.BaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.pojoclasses.SelectHotelPojo;

import cucumber.api.java.en.When;

public class StepDefinitionClass2 extends BaseClass{

	static SelectHotelPojo sh;

@When("User has to select the radio button")
public void user_has_to_select_the_radio_button() {

	sh = PageObjectManager.getselecthotelpojo();
	
	    btnClick(sh.getRadiobutton());
}
@When("User has to click on continue button")
public void user_has_to_click_on_continue_button() {
	
	sh = PageObjectManager.getselecthotelpojo();
	
	        btnClick(sh.getConti());
}
}

