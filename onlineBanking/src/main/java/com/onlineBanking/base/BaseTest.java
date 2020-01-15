package com.onlineBanking.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	public BaseTest() {
		prop = new Properties();
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("C:\\study-java\\onlineBanking\\src\\main\\java\\com\\onlineBanking\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();		
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
	
	
	public static void initialization() {
		
		logger = Logger.getLogger(BaseTest.class.getName());
		PropertyConfigurator.configure("C:\\study-java\\onlineBanking\\src\\main\\java\\com\\onlineBanking\\config\\log4j.properties");
		
		
		String browserName = prop.getProperty("browser");
		logger.info("browser is " + browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			logger.info("opening chrome browser");
			driver = new ChromeDriver();			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			logger.info("opening Firefox browser");
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {			
			WebDriverManager.iedriver().setup();
			logger.info("opening IE browser");
			driver = new InternetExplorerDriver();			
		}else if(browserName.equalsIgnoreCase("safari")) {
			logger.info("opening safari browser");
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		logger.info("navigate to the " + prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		
	}
	
	

}