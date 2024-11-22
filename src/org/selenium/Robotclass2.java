package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Stefi");
		
		//Actions-->Predefined class
		Actions act = new Actions(driver);
		//Double click
		act.doubleClick(email).perform();
		
		//Right click
		act.contextClick(email).perform();
		
		//Robot-->Predefined class
		Robot r = new Robot();
		
		for(int i =0; i<5; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	}

}
