package week2.day1.assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		System.out.println("(Click on Find Lead)The Title: " + driver.getTitle());

		// 7. Click on Phone or name
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		// 8 Enter phone number or firstname
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("firstName");
		// 9 Click find leads button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// 10 Capture lead ID of First Resulting lead
		Thread.sleep(2000);
		String firstName1 = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a/preceding::a[2]"))
				.getText();
		System.out.println("Capture lead ID of First Resulting lead: " + firstName1);
		// 11 Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a/preceding::a[2]"))
				.click();
		// 12 Capture name of First Resulting lead
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Capture name of First Resulting lead: " + firstName);

		// 13C lick Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		// 14 Verify the title as 'Duplicate Lead'
		System.out.println("Verify the title as 'Duplicate Lead: " + driver.getTitle());
		// 15 Click Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		// 16 Confirm the duplicated lead name is same as captured name
		String CopiedName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Confirm the duplicated lead name is same as captured name: " + CopiedName);
		if (CopiedName.equals(firstName)) {
			System.out.println("The actual name and duplicate ID matches");
		}

		else {
			System.out.println("No matches found");
		}
		// 17 Close the browser (Do not log out)
		driver.close();
	}

}