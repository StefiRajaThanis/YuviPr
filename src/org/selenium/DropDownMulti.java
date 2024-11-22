package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMulti {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");

		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		Select s = new Select(fruits);
		s.selectByIndex(0);
		s.selectByVisibleText("Apple");
//		s.selectByValue("Grape");
		s.selectByIndex(3);
		
	    boolean multiple = s.isMultiple();
	    System.out.println(multiple);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		
		
		
	}

}
