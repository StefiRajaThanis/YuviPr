package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesNewbatch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		Thread.sleep(3000);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println(size);
		
		//Switching to the frame by id
		driver.switchTo().frame("firstFr");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']"));
		firstname.sendKeys("Stefi");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']"));
		lastname.sendKeys("Sthjkg");

		//Switching to the frame by WebElement refname
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(iframe1);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Stefi@gmail.com");
	}

}
