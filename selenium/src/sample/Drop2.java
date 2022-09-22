package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/LenovoT420/Documents/dropdown.html");
	WebElement ab = driver.findElement(By.id("empire"));
	Select xy = new Select(ab);
	boolean a = xy.isMultiple();
	if(a)
	{
		System.out.println("it is a multi selected dropdown");
	}
	else
	{
		System.out.println("it is not a multiple dropdown");
	}
	
}
}


