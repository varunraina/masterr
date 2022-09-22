package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File
{
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/LenovoT420/Documents/abc.html");
	WebElement ab = driver.findElement(By.name("upload file"));
	ab.sendKeys("C:\\Users\\LenovoT420\\Downloads\\Resume-Template-Creative-Security-Guard-724x1024.jpg");
}
}