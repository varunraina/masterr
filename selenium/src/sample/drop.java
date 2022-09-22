package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LenovoT420/Documents/dropdown.html");
		WebElement ab = driver.findElement(By.id("month"));
	Select s = new Select(ab);
	List<WebElement> xy = s.getOptions();
	int count = xy.size();
	System.out.println(count);
	for(WebElement abc:xy)
	{
		String a = abc.getText();
		System.out.println(a);
	}
		
	}
	
}
