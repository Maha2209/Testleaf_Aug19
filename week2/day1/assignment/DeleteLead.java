package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
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

		// 6. Click on Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("The Title:" + driver.getTitle());

		// 7. Click on Phone or name
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		// 8 Enter phone number or firstname

		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("firstName");

		// 9 Click find leads button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// 10 Capture lead ID of First Resulting lead
		Thread.sleep(2000);
		// 11 Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a/preceding::a[2]"))
				.click();

		// 12 Click Delete
		driver.findElement(By.linkText("Delete")).click();

		// 13 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// 14 Enter captured lead ID
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("asd");

		// 15 Click find leads button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// 16 Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion
		Thread.sleep(2000);
		String Delete = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (Delete.contains("No records to display")) {
			System.out.println("Succesfully Deleted");
		} else {
			System.out.println("NOT Succesfully Deleted // duplicate exist");

		}
		// 17 Close the browser (Do not log out)
		driver.close();
	}
}