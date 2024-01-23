package Baisc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest {
	
	
	@Test
	public void myntraTest()
	{
			WebDriver cd = new ChromeDriver();
		    cd.manage().window().maximize();
		    
		    cd.get("https://www.myntra.com/");
		    String title = cd.getTitle();
		    System.out.println(title);
		    
	}

}
