package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSingle2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement firstname = driver.findElement(By.id("usernamereg-firstName"));
		firstname.sendKeys("Stefi");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("Arul");
		
		WebElement mail = driver.findElement(By.name("userId"));
		mail.sendKeys("stefi@gmail.com");
		
		WebElement password = driver.findElement(By.id("usernamereg-password"));
		password.sendKeys("Stefi@555");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='mm']"));
		
		//Select --->Predefined class
		Select s = new Select(month);
		//Select by Index
//		s.selectByIndex(5);
//		s.selectByValue("January");
		
	s.selectByVisibleText("December");
		
		//isMultiple()
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		//To get all the options in the dropdown
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		
	//Iterate values using for loop
		
		System.out.println("Using for loop: ");
		for(int i =0; i<options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		//Enhanced for loop
		System.out.println("Enhanced for loop: ");
		for(WebElement x: options) {
			String text = x.getText();
			System.out.println(text);
		}
		
		
		
	}

}
