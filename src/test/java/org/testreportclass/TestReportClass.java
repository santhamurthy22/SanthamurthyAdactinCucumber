package org.testreportclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class TestReportClass {

	public static void generateJvmReport(String json) {

		net.masterthought.cucumber.Configuration con = new net.masterthought.cucumber.Configuration(
				new File("./src/test/resources/Reports"), "ADACTIN");

		con.addClassifications("Platform Name", "Windows");
		con.addClassifications("Platform Version", "10");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "87.0");
		con.addClassifications("Sprint", "21");

		List<String> l = new ArrayList<String>();
		l.add(json);

		new ReportBuilder(l, con).generateReports();

	}
}
