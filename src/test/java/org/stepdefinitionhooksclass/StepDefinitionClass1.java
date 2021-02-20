package org.stepdefinitionhooksclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjectmanager.PageObjectManager;
import org.pojoclasses.SearchHotelPojo;

import cucumber.api.java.en.When;

public class StepDefinitionClass1 extends BaseClass {

	static SearchHotelPojo s;

	@When("User has to select the location drop down")
	public void user_has_to_select_the_location_drop_down() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		WebElement location = s.getLocation();
		txtSelect(location, "Sydney");
	}
	@When("User has to select the hotel drop down")
	public void user_has_to_select_the_hotel_drop_down() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		WebElement hotels = s.getHotels();
		txtSelect(hotels, "Hotel Creek");
	}
	@When("User has to select the room type drop down")
	public void user_has_to_select_the_room_type_drop_down() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		WebElement roomtype = s.getRoom_type();
		txtSelect(roomtype, "Standard");
	}
	@When("User has to select the number of rooms drop down")
	public void user_has_to_select_the_number_of_rooms_drop_down() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		WebElement roomnos = s.getRoom_nos();
		txtSelect(roomnos, "1 - One");
	}
	@When("User has to enter the check in date")
	public void user_has_to_enter_the_check_in_date() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		searchFill(s.getDatepick_in(), "22/02/20121");
	}
	@When("User has to enter the chek out date")
	public void user_has_to_enter_the_chek_out_date() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		searchFill(s.getDatepick_out(), "24/02/2021");
	}
	@When("User has to select the adults per room")
	public void user_has_to_select_the_adults_per_room() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		WebElement adultroom = s.getAdult_room();
		txtSelect(adultroom, "2 - Two");
	}
	@When("User has to select the children per room")
	public void user_has_to_select_the_children_per_room() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		WebElement childroom = s.getChild_room();
		txtSelect(childroom, "2 - Two");
	}
	@When("User has to click on search button")
	public void user_has_to_click_on_search_button() {
		
		s = PageObjectManager.getsearchotelpojo();
		
		btnClick(s.getSubmit());
	}	
}
