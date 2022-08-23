package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		
		String path="F:\\Batch_Framework_12\\Config\\config.Properties";
		FileInputStream fis=new FileInputStream(path);
 pro=new Properties();
		pro.load(fis);
		
	}
	
	public String get_BaseUrl_QA1() {
	return	pro.getProperty("BaseUrl_QA1");
	}
	
	
	
}
