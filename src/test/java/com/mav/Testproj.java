package com.mav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testproj {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
        WebDriver s= new ChromeDriver();
		s.get("https://www.flipkart.com/");
		
		s.manage().window().maximize();
		
		s.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 11");
		Thread.sleep(5000);
		
		s.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		s.findElement(By.xpath("//button[@type='submit']")).click();
		
	/*		
		List<WebElement> iphonelist = s.findElements(By.xpath("//div[@class='_4rR01T']"));
	
		for (WebElement obj: iphonelist)
		{
			String text = obj.getText();
		System.out.println(text);
	}
		*/
		
		Thread.sleep(5000);
		s.findElement(By.tagName("a"));

}
}