package org.selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSingle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		firstName.sendKeys("Stefi");
		
		WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		lastName.sendKeys("Arul");
		
		WebElement mail = driver.findElement(By.xpath("//input[@name='userId']"));
		mail.sendKeys("Stefiar");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Stefi@555");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='mm']"));
		//Select class object creation
		Select s = new Select(month);
//		s.selectByIndex(4);
		
//		s.selectByValue("January");
		s.selectByVisibleText("October");
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("Iterate values using for loop: ");
		for(int i =0; i<options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
		//Enhanced for loop
		System.out.println("Iterate values using enhanced for loop: ");
		for(WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
		}

	}

}
