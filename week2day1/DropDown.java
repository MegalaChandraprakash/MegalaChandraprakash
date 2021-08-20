package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement drop1=driver.findElement(By.id("dropdown1"));
		Select drpDwn = new Select(drop1);
		drpDwn.selectByIndex(2);
		
		
		
		WebElement drop2=driver.findElement(By.name("dropdown2"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByVisibleText("Loadrunner");
		
		WebElement drop3 = driver.findElement (By.id("dropdown3"));
		Select drpDwn3 =new Select(drop3);
		drpDwn3.selectByValue("4");
        int sizeDrpDwn3 =drpDwn3.getOptions().size();
        System.out.println("size of the third drop dowm:"+sizeDrpDwn3);
		
		
		
	}

}
