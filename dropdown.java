package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		//to launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//to load url
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		// 1) choose the option based on index
		WebElement ele = driver.findElement(By.id("dropdown1"));
		Select dd = new Select(ele);
		dd.selectByIndex(1);
		
		// b) choose the option based on visible text
			WebElement ele1=driver.findElement(By.name("dropdown2"));
			Select dd1=new Select(ele1);				
			dd1.selectByVisibleText("UFT/QTP");
			
		
		// a) choose the option based on value
			WebElement ele2=driver.findElement(By.id("dropdown3"));
			Select dd2=new Select(ele2);
		    dd2.selectByValue("2");
		
		
		
		
		
		
	}

}
