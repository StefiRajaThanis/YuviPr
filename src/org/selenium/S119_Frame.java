package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class S119_Frame {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int size = totalframes.size();
		System.out.println(size);
		
		//Switing to the frames by String id or name
		driver.switchTo().frame("firstFr");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']"));
		firstname.sendKeys("Stefi");
		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Arul");
		
		//Switching to the frames by WebElementrefname
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(iframe2);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Stefi@gmail.com");
		

	}

}
