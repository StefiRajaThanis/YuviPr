package org.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Simple alert
		WebElement simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		simple.click();
		
		Thread.sleep(3000);
		//Switching to alert
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		//Confirm alert
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		confirm.click();
		
		Thread.sleep(3000);
		//Switching to the alert
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//Prompt Alert
		WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
		prompt.click();
		//Switching to alert
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Stefi");
		promptAlert.accept();
		
	}

}
