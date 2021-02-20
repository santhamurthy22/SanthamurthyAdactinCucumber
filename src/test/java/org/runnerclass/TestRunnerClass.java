package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testreportclass.TestReportClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources", 
	glue="org.stepdefinitionhooksclass",
	monochrome=true, 
	dryRun=false,
	plugin= {"html:target","json:target\\ADACTIN.json"})        
	
	public class TestRunnerClass extends TestReportClass {
	
		@AfterClass
		
		public static void reportGeneration() {
			
			generateJvmReport("target\\ADACTIN.json");		
		}
	}