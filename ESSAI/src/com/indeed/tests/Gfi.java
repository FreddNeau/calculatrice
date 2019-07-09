package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gfi {
	
	
public void connectGfi(String url  ) {
		
	

	/*
	 * Ouverture d'instance pour utiliser les methodes de la classe WebDriver
	 */
	WebDriver driver = new ChromeDriver();
	
	/*
	 * Gestion de la fenetre du navigateur : Maximiser le navigateur
	 */
	driver.manage().window().maximize();
	/*
	 * Envoie d'URL dans le navigateur
	 */
	driver.get(url);
		/*
		 * Clique sur le bouton connection
		 */
		
		driver.findElement(By.xpath("//*[@id='main-navigation']/ul[1]/li[1]/a")).click();
		
		driver.close();
	}

}
