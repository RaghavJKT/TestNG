package com.jktech.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


@Test
public class ReadFromPropertyFile {
	
	Properties prop;
	
	public void propertyfile() throws IOException {
		
		try {
			File fi = new File("C:\\Users\\Ragavendran.v\\eclipse-workspace\\TestNGExample\\TestData\\TestData.properties");
			FileInputStream fis = new FileInputStream(fi);
			prop = new Properties();
			prop.load(fis);
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("passw0rd"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	

}
