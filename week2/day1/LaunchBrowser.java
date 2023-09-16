package week2.day1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.get("http://facebook.com");

		// maximize the window
		
		  Options manage = driver.manage(); 
		  Window window = manage.window();
		  window.maximize();
		 
	//	driver.manage().window().maximize();

		// to get the title of the Current page
		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(5000);

		// close the browser
		driver.close();

	}
}
