package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in/selenium-course-content.html");
		
		//Actions class
		Actions act = new Actions(driver);
		//Mouse over actions for courses
		WebElement courses = driver.findElement(By.xpath("//div[@title='Courses']"));
		act.moveToElement(courses).perform();
		
		//Software testing
		WebElement softwaretest = driver.findElement(By.xpath("//div[@title='Software Testing']"));
		act.moveToElement(softwaretest).perform();
		
		//movetoElement for Istqb cerification
		WebElement istqb = driver.findElement(By.xpath("//span[text()='ISTQB Certification']"));
		act.moveToElement(istqb).perform();

	}

}
