package selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ZomatoTest {
	@Parameters ("Browser")
	@Test
	public void cricbuzzTest(String browser) throws InterruptedException
	{
		WebDriver driver = null;
		switch (browser)
			{
				case "chrome" : driver = new ChromeDriver();
								break;
					
				case "edge" : driver = new EdgeDriver();
								break;
					
				default : System.out.println("Invalid Browser");
								break;
			}
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		
	}
}
