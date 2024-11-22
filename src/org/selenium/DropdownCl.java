package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		//Select class
		Select s  = new Select(fruits);
		boolean multi = s.isMultiple();
		System.out.println(multi);
		s.selectByIndex(0);
		s.selectByVisibleText("Orange");
		s.selectByIndex(3);
		
		System.out.println("All elements in the dropdown: ");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement x : allSelectedOptions) {
			String text = x.getText();
			System.out.println(text);
		}
		
		//getFirstSelectedOption
		System.out.println("First Selected Option: ");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		//getOptions()
		List<WebElement> options = s.getOptions();
		
		System.out.println("All options in the dropdown: ");
		for(int i = 0; i<options.size(); i++) {
			WebElement webElement = options.get(i);
			String text2 = webElement.getText();
			System.out.println(text2);
		}
		
		s.deselectByIndex(0);
		s.deselectByVisibleText("Orange");
//		s.deselectAll();
		

	}

}
