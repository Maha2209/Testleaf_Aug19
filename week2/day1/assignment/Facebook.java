/*Assignment:1
FaceBook:
================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
( A normal click will do for this step) 
*/
package week2.day1.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		// Step 1: Download and set the path
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mahalakshmi");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("A");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("passwd");
		// Step 11: Handle all the three drop downs
		// Selecting Date
		WebElement selDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sec = new Select(selDate);
		sec.selectByValue("1");
		// Selecting Month
		WebElement selMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sec1 = new Select(selMonth);
		sec1.selectByVisibleText("Jan");
		// Selecting Year
		WebElement selYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sec2 = new Select(selYear);
		sec2.selectByVisibleText("2000");
		// Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();

	}

}
