package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver=new ChromeDriver();
      //load the url
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();
      //title of the page
      String title = driver.getTitle();
      System.err.println(title);
      
      driver.close();
      
	}

		
	}
