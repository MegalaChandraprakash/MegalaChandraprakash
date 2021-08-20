package week2day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginFacebook {
	
	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElementByName("firstname").sendKeys("megala");
		 driver.findElementByName("lastname").sendKeys("barani");
		 driver.findElement(By.name("reg_email__")).sendKeys("9677562642");
		 driver.findElement(By.id("password_step_input")).sendKeys("RishiKalyan");
		 
		 WebElement date = driver.findElementByName("birthday_day");
		 Select drpDwn1 = new Select(date);
		 drpDwn1.selectByValue("18");
		 
		 WebElement month = driver.findElementByName("birthday_month");
		 Select drpDwn2 = new Select(month);
		 drpDwn2.selectByVisibleText("Sep");
		 
		 WebElement year = driver.findElementByName("birthday_year");
		 Select drpDwn3 = new Select(year);
		 drpDwn3.selectByValue("1989");
		 driver.findElementByClassName("_8esa").click();
		
		 
		 
		 
		 
		 
		 
		 
		 
		
	

	
	}

}
