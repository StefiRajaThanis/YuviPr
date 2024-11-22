package org.selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println(size);
		//Switching to the frame by using name
		driver.switchTo().frame("firstFr");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']"));
		firstname.sendKeys("Stefi");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']"));
		lastname.sendKeys("Arul");
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		//Switching to the frame by WebElement refname
		driver.switchTo().frame(frame2);
		
//		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("stefi@gmail.com");

	}

}
