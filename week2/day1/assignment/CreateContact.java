package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	// Pseudo Code
	public static void main(String[] args) {

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		// 6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		System.out.println("The Title:" + driver.getTitle());
		// 7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("firstNameField");
		// 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("LasttNameField");
		// 9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("createContactForm_firstNameLocal");
		// 10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("createContactForm_lastNameLocal");
		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.xpath("//span[text()='Department']/following::input")).sendKeys("Department");
		// 12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).sendKeys("Description");
		// 13. Enter your email in the E-mail address Field using the locator of your
		// choice
		driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input")).sendKeys("EMailAddress@gmail.com");

		// 14. Select State/Province as NewYork Using Visible Text
		WebElement selState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sec = new Select(selState);
		sec.selectByVisibleText("New York");

		// 15. Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();

		// 16. Click on edit button
		driver.findElement(By.linkText("Edit")).click();

		// 17. Clear the Description Field using .clear
		driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).clear();

		// 18. Fill ImportantNote Field with Any text
		driver.findElement(By.xpath("//span[text()='Important Note']/following::textarea")).sendKeys("Important Note");

		// 19. Click on update button using Xpath locator
		driver.findElement(By.className("smallSubmit")).click();

		// 20. Get the Title of Resulting Page.
		System.out.println("The Title:" + driver.getTitle());
	}
}