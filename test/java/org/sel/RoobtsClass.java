package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoobtsClass {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

		// WebElement f1 = driver.findElement(By.id("content"));
		Thread.sleep(3000);
		TakesScreenshot shot = (TakesScreenshot) driver;

		File screenshotAs = shot.getScreenshotAs(OutputType.FILE);

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\picture\\avinash.png");

		Thread.sleep(3000);
		FileUtils.copyFile(screenshotAs, f);
		System.out.println(f);

		

		

	}

}
