package com;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {
	WebDriver driver = null;

	public void T() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='remember']")).click();
		driver.findElement(By.xpath("//*[@name='proceed']")).click();

		Thread.sleep(5000);
		driver.quit();
	}

	public void T1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");

		driver.manage().window().maximize();
		Thread.sleep(5000);
		// driver.findElement(By.className("ZFr60d CeoRYc")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		// driver.findElement(By.xpath("//*[@class='uBOgn']")).click();

		Thread.sleep(5000);
		driver.quit();
	}

	public void T2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='srg']//a"));
		Thread.sleep(5000);
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='srg']//h3//a[contains(text(),'Selenium')]"));
		
		int counter=0;
	
		for (WebElement temp : links) {
			System.out.println(temp.getText());
			counter++;
			if(counter>10){
				driver.quit();
				break;
			}
			
		}		
		
	}

}
