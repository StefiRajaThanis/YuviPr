package org.selenium;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Apple Iphone");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]")).click();

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window id: "+parentWindowId);
		//Switching to windows
		driver.switchTo().window(parentWindowId);

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		
		//Enhanced for loop
		for(String x : allWindowsId) {
			if(!parentWindowId.equals(x)) {
				driver.switchTo().window(x);
				System.out.println("First Child Window Id: "+x);
			}
		}
		
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[3]")).click();
		
		Set<String> allwindowSiD2 = driver.getWindowHandles();
		System.out.println(allwindowSiD2);
		
		//Linked List
		List<String> li = new LinkedList<String>();
		li.addAll(allwindowSiD2);
		System.out.println(li);
		
		String string = li.get(2);
		System.out.println("Second Child Window Id: "+string);
		
		driver.switchTo().window(parentWindowId);
		
	}

}
