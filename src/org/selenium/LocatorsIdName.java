package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIdName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//SendKeys method to insert the values in the textbox
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("stefi@gmail.com");
		
		//Sending password
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Stefi@555");
		
		//Click login button
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

}
