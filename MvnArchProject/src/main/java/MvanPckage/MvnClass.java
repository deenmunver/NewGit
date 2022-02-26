package MvanPckage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MvnClass {
	
	@Test
	public void openiur() {
	System.setProperty("webdriver.chrome.driver", "D:\\Marriage photos\\frames\\software QA\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();

}
}