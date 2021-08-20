package week2day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;


public class DailyAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		// Step 1: Launch a chrome browser
		ChromeDriver driver=new ChromeDriver();
		// Step 2 :Load an URL--> get
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//Step 3: Print the title--.getTitle
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement drpDwn = driver.findElement(By.id("dropdown1"));
		 Select box1 = new Select(drpDwn);
		 box1.selectByIndex(box1.getOptions().size()-2);
		

	
	

	}

}
