package org.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit Wait
//		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		
WebElement user = driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]"));
user.sendKeys("Stefi@gmail.com");

//Explicit Wait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOf(user));

WebElement pass = driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[2]"));
pass.sendKeys("stefi@555");

wait.until(ExpectedConditions.visibilityOf(pass));

WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
login.click();



	}

}
