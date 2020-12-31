package com.gov.dmv.appoinment;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Appoint {
	public WebDriver driver;
  @Test
  public void checkAppoinment() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "E:\\Batch114\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.dmv.ca.gov");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       driver.findElement(By.xpath("//a[@href='/portal/dmv/dmv/appointments']")).click();
       driver.findElement(By.xpath("//a[@href='/wasapp/foa/clear.do?goTo=driveTest&localeName=en\']")).click();
       WebElement sel=driver.findElement(By.id("officeId"));
       Select dd=new Select(sel);
       dd.selectByVisibleText("SANTA CLARA");
       driver.findElement(By.xpath("//input[@id='DT']")).click();
       driver.findElement(By.id("firstName")).sendKeys("ABHIJIT");
       driver.findElement(By.id("lastName")).sendKeys("GANGOPADHYAY");
       driver.findElement(By.id("dl_number")).sendKeys("Y6173009");
       driver.findElement(By.id("birthMonth")).sendKeys("02");
       driver.findElement(By.id("birthDay")).sendKeys("12");
       driver.findElement(By.id("birthYear")).sendKeys("1982");
       driver.findElement(By.id("areaCode")).sendKeys("530");
       driver.findElement(By.id("telPrefix")).sendKeys("407");
       driver.findElement(By.id("telSuffix")).sendKeys("6350");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.close();
      
       }
       }
