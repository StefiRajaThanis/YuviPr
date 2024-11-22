package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesNew {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Stefi");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println(size);
		
		//Switching to the frame by id or name
		driver.switchTo().frame("firstFr");
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Stefi");
		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Arul");
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
		//switching the frames by webelementrefname
		driver.switchTo().frame(iframe1);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Stefi@gmail.com");
	}

}
