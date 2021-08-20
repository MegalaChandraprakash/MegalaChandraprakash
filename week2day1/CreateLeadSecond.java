package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateLeadSecond {
	
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
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Megala");  
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandru");
		WebElement countryCOde = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCOde.clear();
		countryCOde.sendKeys("4");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn = new Select(source);
		drpDwn.selectByIndex(2);
		
		WebElement marketing = driver.findElementByName("marketingCampaignId");
		Select drpDwn1 = new Select(marketing);
		drpDwn1.selectByVisibleText("Car and Driver");
		
		 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("goodWill");
		
		 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/18/1989");
		 
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("selenium");
		 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("90000");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("biochemistry");
		 WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select drpDwn2 = new Select (industry);
		 drpDwn2.selectByIndex(3);
		 WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		 Select drpDwn3 = new Select (currency);
		drpDwn3.selectByValue("INR");
		 
		 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("mega");
		 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kalyani");
		 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("SBIOA");
		 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("mabakkam");
		 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		 
		 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600127");
		 WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		 Select drpDwn5 = new Select(country);
		 drpDwn5.selectByValue("IND");
		 
		
		
		   driver.findElementByName("submitButton").click();
		
		

	}

}
