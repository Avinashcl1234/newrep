package org.pag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetParagraphINwebsite {
	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.facebook.com/");
         WebElement element = driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]"));
         String text = element.getText();
         System.out.println(text);
	}

}
