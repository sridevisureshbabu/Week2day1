package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to setup the browser
				WebDriverManager.chromedriver().setup();
				//to launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//to load url
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//to maximixe
				driver.manage().window().maximize();

				WebElement eleUserName=driver.findElement(By.id("username"));
				//enter username
				eleUserName.sendKeys("DemoSalesManager");
				//enter password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//perform click
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sri");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("devi");
				
				WebElement elesource=driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dropdownobj=new Select(elesource);
				dropdownobj.selectByVisibleText("Conference");
				
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suja");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Prasad");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Admin");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mp@gmail.com");
				
				WebElement elestate=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select dropdownobjstate=new Select(elestate);
				dropdownobjstate.selectByVisibleText("New York");
				
				
				
				
		     	driver.findElement(By.name("submitButton")).click();
		     	
                driver.findElement(By.linkText("Edit")).click();
				
				
				driver.findElement(By.name("description")).clear();
				
				
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(" Important note");
				
		     	
		     	//get title
		     	System.out.println("the title is:"+ driver.getTitle());
	}

}
