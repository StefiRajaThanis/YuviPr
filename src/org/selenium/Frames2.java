package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Switching to the frames
		driver.switchTo().frame("firstFr");
		
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Stefi");
		
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("Arul");
		
		WebElement email = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(email);
		
		WebElement gmail = driver.findElement(By.name("email"));
		gmail.sendKeys("Stefi@gmail.com");
		

	}

}
