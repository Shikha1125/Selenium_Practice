package com.test.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchWebBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");

		        

		        WebDriver driver = new ChromeDriver();

		        String url = "http://www.google.com";

		        driver.get(url);

		        driver.manage().window().maximize();

		       // driver.findElement(By.xpath("//div[text()='Accept all']/parent::button")).click();

		        driver.findElement(By.xpath("//div//textarea[@name='q']")).click();

		        driver.findElement(By.xpath("//div//textarea[@name='q']")).sendKeys("TutorialPoint");

		        driver.findElement(By.xpath("//div//textarea[@name='q']")).sendKeys(Keys.ENTER);

		        WebElement tutorialLink = driver.findElement(By.xpath("//h3[contains(text(),'Tutorialspoint: Online Tutorials, Courses, and eBooks Library')]"));

		        tutorialLink.click();
		        
		        

		        //driver.close();

		    }
	}
