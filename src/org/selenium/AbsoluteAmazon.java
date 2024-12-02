package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteAmazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement search = driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input"));
		search.sendKeys("Apple Iphone");
		
WebElement searchButton = driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div[3]/div/span/input"));
		searchButton.click();

		driver.get("https://login.yahoo.com/account/create");
WebElement fullname = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/fieldset[1]/div/div[1]/input"));
	}

}
