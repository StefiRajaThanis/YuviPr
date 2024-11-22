package org.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import com.google.common.io.Files;

public class ScreenshotClas {
	
static WebDriver driver;

	private static void screenshot(String name) throws IOException {
		//Screenshot
				//Downcasting for TakesScreenshot
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				File destination = new File("E:\\Screenshot\\"+name+".jpeg");
				
				//Files.copy(source, destination);
				FileHandler.copy(source, destination);
	}
	
	public static void main(String[] args) throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		screenshot("HomePage");
	

	}

}
