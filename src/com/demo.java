package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REDI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver C=new ChromeDriver();
		  C.get("https://timetracker.ctepl.com/actitime/login.do");
		  Thread.sleep(2000);
		 WebElement UN = C.findElement(By.name("username"));
		UN.sendKeys("situ");
		Thread.sleep(2000);
		 WebElement pwd = C.findElement(By.name("pwd"));
		pwd.sendKeys("sia");
		Thread.sleep(2000);
		C.findElement(By.id("loginButton")).click();
		
	}

}
