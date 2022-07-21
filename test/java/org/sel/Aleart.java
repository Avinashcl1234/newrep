package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aleart {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		WebElement element = driver.findElement(By.id("accept"));
		element.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		WebElement element2 = driver.findElement(By.id("confirm"));
		element2.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		WebElement element3 = driver.findElement(By.id("prompt"));
		element3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("avinsh");
		Thread.sleep(3000);
		alert3.accept();
		System.out.println("git");
		
	}

}
