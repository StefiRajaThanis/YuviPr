package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> headings = driver.findElements(By.xpath("(//table)[1]/tbody/tr[1]/th"));
		//Enhanced for loop
		System.out.println("Table Headings: ");
		for(WebElement x: headings) {
			String text = x.getText();
			System.out.println(text);
		}
		//Table datats
		List<WebElement> tDatas = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
		//Enhanced for loop
		System.out.println("Table datas: ");
		for(WebElement x : tDatas) {
			String text = x.getText();
			System.out.println(text);
		}
		//Fourth row datas
		List<WebElement> fouthRowDatas = driver.findElements(By.xpath("(//table)[1]/tbody/tr[5]/td"));
		//For loop
		for(int i =0; i<fouthRowDatas.size(); i++) {
			WebElement webElement = fouthRowDatas.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}

	}

}
