package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		//Actions class
		Actions act = new Actions(driver);
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement accountholder1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(bank, accountholder1).perform();
		
		WebElement sales = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
		WebElement accountholder2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act.dragAndDrop(sales, accountholder2).perform();
	}

}
