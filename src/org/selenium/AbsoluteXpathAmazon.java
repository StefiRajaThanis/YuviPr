package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathAmazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
WebElement search = driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div[2]/div/form/div[2]/div/input"));
		search.sendKeys("Redmi");
		

	}

}
