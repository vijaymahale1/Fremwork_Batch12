package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		
		
		String path="C:\\Users\\uSER\\eclipse-workspace\\Batch12_Framework\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		
		reporter.config().setReportName("Test Batch 12 Report");
		
		reporter.config().setTheme(Theme.DARK);
		
		
	    extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Test Batch Project");
		
		extent.setSystemInfo("O.S.", "Windows");
		
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		
		extent.setSystemInfo("QA", "Vijay Mahale");
		
		return extent;
	}

}
