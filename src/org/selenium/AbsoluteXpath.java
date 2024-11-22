package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AbsoluteXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
WebElement user = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div[2]/div/div/form/div/div[1]/input"));
		user.sendKeys("Stefi");

WebElement pass = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div[2]/div/div/form/div/div[2]/div/input"));
		pass.sendKeys("Stefi@555");
		
WebElement login = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div[2]/div/div/form/div[2]/button"));
		login.click();
	}

}
