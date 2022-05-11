package com.VTiger.generic;

import java.io.FileInputStream;
import java.util.Properties;


import java.io.IOException;

public class ProppertyFiles 
{
	public String readDatafrompropertyfile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\teja\\eclipse-workspace\\TYSS_Teja1\\file.properties");

		Properties prop = new Properties();
		prop.load(fis);

		return	prop.getProperty(key);

	}


}