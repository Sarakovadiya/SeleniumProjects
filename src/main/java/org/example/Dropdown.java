package org.example;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.Assert;



public class Dropdown {



    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "/Users/sarakovadiya/Documents/chromedriver");

        WebDriver driver =new ChromeDriver();

        driver.get("http://spicejet.com"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

        driver.findElement(By.id("css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

    }



}



