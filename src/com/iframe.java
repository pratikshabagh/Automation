package com;

import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REDI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver C=new ChromeDriver();
		  C.get("https://www.naukri.com/");
		  Thread.sleep(2000);
	}

}
