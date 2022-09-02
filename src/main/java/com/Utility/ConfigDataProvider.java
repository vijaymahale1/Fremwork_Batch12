package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String path="C:\\Users\\uSER\\eclipse-workspace\\Batch12_Framework\\config\\config.Properties";
		
		FileInputStream fis=new FileInputStream(path);
		
	    pro=new Properties();
		
		pro.load(fis);
		
		}
	// call the method key through "URL"Execution 
	public String get_BaseUrl_QA1() {
		
		return pro.getProperty("BaseUrl_QA1");
		}
	
	public String get_BaseUrl_QA2() {
		
		return pro.getProperty("BaseUrl_QA2");
		
		
	}
}
