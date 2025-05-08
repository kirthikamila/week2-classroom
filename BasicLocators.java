package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// steps to interact with web element
		// 1. locate the element from the dom
		
		ChromeDriver driver=new ChromeDriver();
	      
	      driver.get("https://www.facebook.com");
	      driver.manage().window().maximize();
	
	      String title = driver.getTitle();
	      System.out.println(title);
	      // enter the username
	      driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	      driver.findElement(By.name("pass")).sendKeys("Tuna@321");
	      driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
	     
	}

}
