package checkDayNameOfDate;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.text.Format;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  

import org.openqa.selenium.chrome.ChromeDriver;

public class TC1001checkNameDayOfDate {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

//setting the driver executable
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

//Initiating your chromedriver
WebDriver driver=new ChromeDriver();

//Applied wait time
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
driver.manage().window().maximize();

//open browser with desried URL
driver.get("http://localhost/checkDayNameOfDate/"); 
driver.findElement(By.id("formGroupExampleInput2")).sendKeys("กัตพัตร์ สมหวัง");
driver.findElement(By.xpath("/html/body/div/div/div[2]/form/input")).sendKeys("11/3/2565");


driver.findElement(By.id("submitDay")).click();

String status = driver.findElement(By.id("status")).getText();
assertEquals("Successfully!", status); 

String nameDate = driver.findElement(By.id("nameDate")).getText();
assertEquals("วันอาทิตย์", nameDate); 


Thread.sleep(2000);

//closing the browser
driver.close();

}

private static void assertEquals(String string, String status) {
	// TODO Auto-generated method stub
	
}

}