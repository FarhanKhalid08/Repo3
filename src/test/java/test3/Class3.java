package test3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
public static WebDriver driver;
public static void main (String[] args) throws Exception {
	
	ScreenRecorderUtil.startRecord("ScreenRecording");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://rediff.com");
	driver.findElement(By.cssSelector("a.signin")).click();
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	 driver.findElement(By.id("login1")).sendKeys("Farhankhalid920@hotmail.com");
     driver.findElement(By.id("password")).sendKeys("subhan");
     driver.quit();
     ScreenRecorderUtil.stopRecord();
	
	
}
}
