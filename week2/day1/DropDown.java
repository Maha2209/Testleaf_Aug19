package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the window
		driver.manage().window().maximize();

		// enter the username-> Ctrl+2,l
		WebElement eleUsername = driver.findElement(By.id("username"));

		// do the action with the WebElement
		// to type in a text
		eleUsername.sendKeys("Demosalesmanager");
		// or=> driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		

		
		
	}
}
