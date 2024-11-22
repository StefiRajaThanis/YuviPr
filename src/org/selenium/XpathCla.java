package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCla {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("stefi@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		pass.sendKeys("Stefi@555");
//		
//		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
//		login.click();
		
		//Xpath by text concept
//		WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
//		String text2 = text.getText();
//		System.out.println(text2);
		
		//Contains text based xpath
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(), 'Facebook helps')]"));
		String text2 = text.getText();
		System.out.println(text2);
	}

}
