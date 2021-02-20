package org.pojoclasses;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPojo extends BaseClass{

	public SelectHotelPojo() {
		PageFactory.initElements(d, this);
	}
	
    @FindBy(id="radiobutton_0")
    private WebElement radiobutton;
	
    @FindBy(id="continue")
    private WebElement conti;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getConti() {
		return conti;
	}
}

