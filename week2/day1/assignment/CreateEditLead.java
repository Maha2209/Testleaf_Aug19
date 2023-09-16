package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateEditLead {

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

		// 5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// 6. Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("The Title:" + driver.getTitle());

		// 7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("companyName");

		// 8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");

		// 9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastName");

		// 10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("firstNameLocal");

		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.xpath("//span[text()='Department']/following::input")).sendKeys("departmentName");

		// 12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//span[text()='Description']/following::textarea"))
				.sendKeys("createLeadForm_description");

		// 13. Enter your email in the E-mail address Field using the locator of your
		// choice
		driver.findElement(
				By.xpath("//span[text()='E-Mail Address']/following::input[@id='createLeadForm_primaryEmail']"))
				.sendKeys("abc@gmail.com");

		// 14. Select State/Province as NewYork Using Visible Text
		WebElement selState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(selState);
		sec.selectByVisibleText("New York");
		//Enter Phone Number:
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("1234567890");

		// 15. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();

		// 16. Get the Title of Resulting Page. refer the video using driver.getTitle()
		System.out.println("The Title:" + driver.getTitle());

		// 16. Click on edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		// 17. Clear the Description Field using .clear()
		driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).clear();

		// 18. Fill ImportantNote Field with Any text

		driver.findElement(By.xpath("//span[text()='Important Note']/following::textarea")).sendKeys("Important Note");
		// 19. Click on update button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		// 20. Get the Title of Resulting Page. refer the video using driver.getTitle()
		System.out.println("The Title:" + driver.getTitle());

	}

}
