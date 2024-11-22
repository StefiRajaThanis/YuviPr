package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Javascript Executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement email = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		js.executeScript("arguments[0].setAttribute('value', 'stefi')", email);
		
		//Get Value using js executor
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println(executeScript);
		
		//Password
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value', 'stefi@555')", pass);
		
		//get the value using js
		Object executeScript2 = js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(executeScript2);

		//Click login using JS executor
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		js.executeScript("arguments[0].click()", login);
		
		//ScrollDown using JavascriptExecutor
		driver.get("https://greenstech.in/");
		
//		WebElement home = driver.findElement(By.linkText("Home"));
//		js.executeScript("arguments[0].scrollIntoView(true)", home);
		
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
	}

}
