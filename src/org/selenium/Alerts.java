package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/alert");
		
		//Simple Alert
		WebElement simple = driver.findElement(By.xpath("//button[@id='accept']"));
		simple.click();
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
       //Confirm Alert
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
		confirm.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		//Prompt Alert
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		prompt.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Stefi");
		promptalert.accept();
	}

}
