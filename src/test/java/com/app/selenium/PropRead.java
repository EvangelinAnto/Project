package com.app.selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropRead {
	
	public static void prop_read() {
		try {
			FileReader read = new FileReader("C:\\Users\\Dell\\eclipse-workspace\\FebProjectClass\\MayProjectClass1\\src\\test\\resources\\resources\\credentials.properties");
		    Properties prop = new Properties();
		    prop.load(read);
		    String url = prop.getProperty("url");
		    System.out.println(url);
		    
		    String user = prop.getProperty("username");
		    System.out.println(user);
		    
		    String pass = prop.getProperty("password");
		    System.out.println(pass);
		    
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		prop_read();
	}

}
