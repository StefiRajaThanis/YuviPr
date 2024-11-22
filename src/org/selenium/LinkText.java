package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Stefi@gmail.com");
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = email.isEnabled();
		System.out.println(enabled);
		
		String attribute = email.getAttribute("name");
		System.out.println(attribute);
		
		//By using linkText 
		WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));
		forgot.click();
		
		//By using partialLinkText
//		WebElement forgotten = driver.findElement(By.partialLinkText("Forgotten"));
//		forgotten.click();
	}

}
