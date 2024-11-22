package org.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunch {
	public static void main(String[] args) {
		//Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL launch
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.in/");
		
		//Get the title from the web page
		String title = driver.getTitle();
		System.out.println(title);
		
		//Get the Current url of webpage
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//Get the page source
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		//Close the current page
		driver.close();
	}

}
