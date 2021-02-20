package org.pageobjectmanager;

import org.baseclass.BaseClass;
import org.pojoclasses.BookAHotelPojo;
import org.pojoclasses.LoginPojo;
import org.pojoclasses.SearchHotelPojo;
import org.pojoclasses.SelectHotelPojo;

public class PageObjectManager extends BaseClass{

	private PageObjectManager() {
}
	private static PageObjectManager pageobjectmanager;
	
	private static LoginPojo loginpojo;
	private static SearchHotelPojo searchotelpojo;
	private static SelectHotelPojo selecthotelpojo;
	private static BookAHotelPojo bookahotelpojo;

	
	public static PageObjectManager getPageObjectManager() {
		
		return(pageobjectmanager==null)?pageobjectmanager= new PageObjectManager():pageobjectmanager;
	}
	
    public static LoginPojo getloginpojo() {
		
		return(loginpojo==null)? loginpojo= new LoginPojo ():loginpojo;
	}

    public static SearchHotelPojo  getsearchotelpojo() {
	
	   return(searchotelpojo ==null)?searchotelpojo = new SearchHotelPojo():searchotelpojo;
}
    
    public static SelectHotelPojo  getselecthotelpojo() {
    	
 	   return(selecthotelpojo ==null)?selecthotelpojo = new SelectHotelPojo():selecthotelpojo;
    }
    
    public static BookAHotelPojo  getbookahotelpojo() {

  	   return(bookahotelpojo ==null)?bookahotelpojo = new BookAHotelPojo():bookahotelpojo;
}
}

    
    
    

