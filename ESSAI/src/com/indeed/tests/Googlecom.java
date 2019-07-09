package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Googlecom {

	 WebDriver driver ;
	
		

	public void connectGoogle(String URL,String Email, String password) throws InterruptedException {
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
		driver.get(URL);
		/*
		 * Clique sur le bouton connection
		 */
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.id("identifierId")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
		driver.close();
	}

	

}
