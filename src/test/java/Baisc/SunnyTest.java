package Baisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SunnyTest {
	
	@Test
	public void tiraTest()
	{
			WebDriver cd = new ChromeDriver();
		    cd.manage().window().maximize();
		    
		    cd.get("https://www.tirabeauty.com/");
		    
		    WebElement tf = cd.findElement(By.id("search"));
		    tf.sendKeys("perfumes");
		    tf.sendKeys(Keys.ENTER);
		    
		    
		    
		    
	}

}


