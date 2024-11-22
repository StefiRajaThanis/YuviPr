package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexBasedXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		//Index based xpath
		WebElement fullname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fullname.sendKeys("stefi");
		
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		surname.sendKeys("stf");
		

	}

}
