package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop1
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/LenovoT420/Documents/dropdown.html");
	WebElement ele = driver.findElement(By.id("empire"));
	Select ab = new Select(ele);
	Thread.sleep(3000);
	ab.selectByIndex(2);
	Thread.sleep(3000);
	ab.selectByVisibleText("pine apple");
	Thread.sleep(3000);
	ab.selectByValue("d");
	
	ab.deselectAll();
}
}
