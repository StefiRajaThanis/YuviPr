package org.selenium;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy");
		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		
		//Parent Windows id
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent window id:"+parentWindowId);
		//All windows Id
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All windows id: "+allWindowsId);

		//Set value based -->Enhanced for loop
		for(String x : allWindowsId) {
			if(!parentWindowId.equals(x)) {
				driver.switchTo().window(x);
				System.out.println("First Child Window Id: "+x);
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentWindowId);
		
driver.findElement(By.xpath("//span[text()='Samsung Galaxy F15 5G (Groovy Violet, 6GB RAM, 128 GB Storage)']")).click();
		
		Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println(allWindowsId2);
		
		List <String> li = new LinkedList<String>();
		li.addAll(allWindowsId2);
		
		String string = li.get(2);
		System.out.println("Second Child Window Id: "+string);
		
		driver.switchTo().window(parentWindowId);
	}

}
