package week2day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	      WebDriverManager.chromedriver().setup();
			
			// Step 1: Launch a chrome browser
			ChromeDriver driver=new ChromeDriver();
			// Step 2 :Load an URL--> get
			driver.get("http://leaftaps.com/opentaps/control/main");
			//Step 3: Print the title--.getTitle
			String title = driver.getTitle();
			System.out.println(title);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		
			
			
			WebElement webUser = driver.findElement(By.id("username"));
			webUser.sendKeys("demosalesmanager");
			//driver.close(); 
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			String title1 ="My Home | opentaps CRM";
			
		   String homeTitle = driver.getTitle();
		    if(title.equals(homeTitle)) {
		   System.out.println("In The HomePage");
		    }
		    else
		    	System.out.println("Not In The HomePage");
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			//driver.findElement(By.partialLinkText("CRM")).click();
	 
			//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
			//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Megala");  
			//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandru");
			
	 
			
		//	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
			
		}

	
	}


