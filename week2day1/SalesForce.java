package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementByName("UserFirstName").sendKeys("megala");
		 driver.findElementByName("UserLastName").sendKeys("rishi");
		  driver.findElementByName("UserEmail").sendKeys("megaraju4@gmail.com");
		  WebElement job = driver.findElementByName("UserTitle");
		  Select drpDwn1 = new Select(job);
		  drpDwn1.selectByVisibleText("CxO / General Manager");
		  driver.findElementByName("CompanyName").sendKeys("ajuba");
		  WebElement employees = driver.findElementByName("CompanyEmployees");
		  Select drpDwn2 = new Select(employees);
		  drpDwn2.selectByVisibleText("501 - 1500 employees");
		  driver.findElementByName("UserPhone").sendKeys("9677562642");
		  WebElement country = driver.findElementByName("CompanyCountry");
		  Select drpDwn3 = new Select(country);
		  drpDwn3.selectByVisibleText("India");
		  driver.close();
		  
		  
		  
		 
		 
		 

	}

}
