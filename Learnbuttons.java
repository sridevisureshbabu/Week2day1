package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnbuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup
		WebDriverManager.chromedriver().setup();
		
		//to launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//to load url
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.get("http://www.leafground.com/pages/Button.html");
		System.out.println("postion is:"+ driver.findElement(By.id("position")).getLocation());
		System.out.println("The color is:"+ driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("The height is:"+ driver.findElement(By.id("size")).getSize());
		
		
		
		
		
		
		
		
		
		
		
	}

}
