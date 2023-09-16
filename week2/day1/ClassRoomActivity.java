/*Launch https://login.salesforce.com/
Enter username as hari.radhakrishnan@qeagle.com
3.  Enter password as Leaf$1234
4.  Click on Login*/
package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomActivity {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://login.salesforce.com/");

		// maximize the window
		driver.manage().window().maximize();
		// apply implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// enter the username-> Ctrl+2,l
		// do the action with the WebElement
		// to type in a text
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("hari.radhakrishnan@qeagle.com");
		// or=>
		// driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

		// enter the password
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");

		// click on the Login button
		driver.findElement(By.id("Login")).click();

		// to get the title of the Current page
		String title = driver.getTitle();
		System.out.println(title);
		// click togglebutton
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

	}
}
