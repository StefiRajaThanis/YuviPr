package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHdfc {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Switching to the frames by using namme
		driver.switchTo().frame("login_page");
		WebElement userid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		userid.sendKeys("Stefi86");
	}

}
