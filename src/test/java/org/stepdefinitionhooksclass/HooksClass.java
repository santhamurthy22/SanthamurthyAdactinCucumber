package org.stepdefinitionhooksclass;

import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.junit.Before;

public class HooksClass extends BaseClass{

	
	@Before
	public void beforeExcecution() {
		
		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
			}
  }
