package org.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsCl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		Thread.sleep(3000);
		
		//Simple alert
		WebElement simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		simple.click();
		Thread.sleep(3000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();

		//Confirm Alert
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		confirm.click();
		Thread.sleep(3000);
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//Prompt Alert
		WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
		prompt.click();
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Stefi");
		promptAlert.accept();
	}

}
