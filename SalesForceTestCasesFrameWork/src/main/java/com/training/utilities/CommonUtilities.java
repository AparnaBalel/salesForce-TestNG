package com.training.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static com.training.utilities.Contants.USER_DIR;
import static com.training.utilities.Contants.APPLICATION_PROPERTIES;

public class CommonUtilities {
	
	public String getproperty(String key ) throws IOException {
		
	String sPath = USER_DIR +File.separator+APPLICATION_PROPERTIES;
	FileInputStream fileinput = new FileInputStream(sPath);
	Properties prop = new Properties ();
	prop.load(fileinput);
	String value  =prop.getProperty(key);
	return value;
	}

	
}
