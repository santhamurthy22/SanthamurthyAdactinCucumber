package org.pojoclasses;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{

	public LoginPojo(){
		PageFactory.initElements(d, this);
		}
	        @FindBy(id="username")
	        private WebElement username;
	        
	        @FindBy(id="password")
	        private WebElement password;
	        
	        @FindBy(id="login")
	        private WebElement login;

			public WebElement getUsername() {
				return username;
			}
			public WebElement getPassword() {
				return password;
			}
			public WebElement getLogin() {
				return login;
			}
			}
