package com.clubKitchen.automate.script;

import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.clubKitchen.automate.util.Utility;

/**
 * Unit test for AssigmentAmazon Automation.
 * Author by Nishant Kumar
 */
public class AssignmentAmazon 
  
{   

	private static final Logger LOGGER = Logger.getLogger(AssignmentAmazon.class);
	
	
	
	
	public static void main(String... s) throws Exception
	{
	   
		Properties props = Utility.readfilefromPathUtil();

		/*
		 * setup method implemented for dynamic loading of driver class
		
		 */
		 System.setProperty("webdriver.chrome.driver", "/Users/nishantkumar/Downloads/chromedriver");
	  	 WebDriver driver= new ChromeDriver();
		
	    driver.get(props.getProperty("clubkitchen.url"));
	    driver.manage().window().maximize();
 	    LOGGER.info("clubkitchen website opened successully !!!");
 	    
 	   
 	    
 	      Utility.acceptCookies(driver);
 	    
 	    /*
 	     * Accepting cookies
 	     */
 	     
 	      
 	      
 	     Utility.mamacita(driver);
 	     
		/*
		 * Clicking on Mamacita image
		 */

 	     
 	     
 	  Utility.address(driver);
		
		/*
		 * Using address “Semperstraße 44, 1180 Wien, Austria” 
		 */
 	  
 	 Utility.addToCart(driver);
 	  
 	 	/*
	      *adding Cheesy Pork Burrito to cart
	      */
 	    
 	
	}

	
		
		
	}

	
	


	 	 
	
