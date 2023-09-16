/*
1. Type your name
2. Append Country to this City
3. Verify if text box is disabled
4. Clear the typed text
5. Retrieve the typed text
6. Type email and Tab. Confirm control moved to next element
7. Type about yourself
8. Text Editor
9. Just Press Enter and confirm error message*
10. Click and Confirm Label Position Changes
11. Type your name and choose the third option
12. Click and Confirm Keyboard appears
13. Custom Toolbar

Button
======
https://www.leafground.com/button.xhtml
1. Click and Confirm title
2. Confirm if the button is disabled
3. Find the position of the Submit button

DropDown
========
https://www.leafground.com/select.xhtml

Checkbox
=======
https://www.leafground.com/checkbox.xhtml

Radio
=====
https://www.leafground.com/radio.xhtml
 */
package week2.day2.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputVal {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
		// Open the URL which has Dropdown Fields
		driver.get("https://leafground.com/input.xhtml");
		// Maximize the browser Window
		driver.manage().window().maximize();
		// Locate and access all drop downs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		Thread.sleep(2000);

		// Locate the input Box using locators/Xpath and send values to them
		// 1. Type your name
		WebElement name = driver.findElement(By.xpath("//div[@class='col-12']//input"));
		name.clear();
		name.sendKeys("Maha");
		Thread.sleep(2000);

		// 2. Append Country to this City
		WebElement city = driver.findElement(By.xpath("(//div[@class='col-12']//input)[2]"));
		city.sendKeys("TamilNadu");
		Thread.sleep(2000);

		// 3. Verify if text box is disabled
		boolean disabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println("Disabled field :" + disabled);
		Thread.sleep(2000);
		if (disabled == true) {

			System.out.println("Text box is enabled");
		} else {

			System.out.println("Text box is disabled");

		}

		// 4. Clear the typed text
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		Thread.sleep(2000);

		// 5. Retrieve the typed text
		WebElement ip4 = driver.findElement(By.id("j_idt88:j_idt97"));
		String ss = ip4.getAttribute("value");
		System.out.println("REtrieved Text from input box : " + ss);
		Thread.sleep(2000);

		// 6. Type email and Tab. Confirm control moved to next element
		WebElement email = driver.findElement(
				By.xpath("//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::input"));
		email.sendKeys("check@mail.com");
		Thread.sleep(2000);
		email.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		// 7. Type about yourself

		driver.findElement(By.xpath("//h5[text()='Type about yourself']/following::textarea"))
				.sendKeys("Aug 19 TestLeaf");
		Thread.sleep(2000);

		// 8. Text Editor
		driver.findElement(By.xpath("//h5[text()='Text Editor']/following::div[@class='ql-editor ql-blank']"))
				.sendKeys("Week 2 Day 2");
		Thread.sleep(2000);

		// 9. Just Press Enter and confirm error message*
		driver.findElement(By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following::input)[2]"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement error = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
		String errMsg = error.getText();
		System.out.println("Error Message : " + errMsg);
		Thread.sleep(2000);

		// 10. Click and Confirm Label Position Changes
		Point beforeclick = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']/following-sibling::Label"))
				.getLocation();
		Thread.sleep(2000);
		System.out.println("The position of the label before click" + beforeclick);
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		Point afterclick = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']/following-sibling::Label"))
				.getLocation();
		System.out.println("The position of the label before click" + afterclick);

		// 11. Type your name and choose the third option
		driver.findElement(By.xpath("//input[contains(@id,'j_idt106:auto-complete_input')]")).sendKeys("username");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"(//ul[contains(@class,'ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container')]/following::span[text()='username'])[3]"))
				.click();

		// 12. Click and Confirm Keyboard appears
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@class='ui-button-text'])[2]")).click();
		driver.findElement(By.id("j_idt106:j_idt116_input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
		driver.findElement(By.xpath("//span[text()='August']/following::a[text()[normalize-space()='15']]")).click();
		Thread.sleep(2000);
		WebElement calender = driver.findElement(By.id("j_idt106:j_idt116_input"));

		String ss2 = calender.getAttribute("value");

		System.out.println(ss2);

		// 13. Custom Toolbar
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']/div[1]"))
				.sendKeys("This is custom tool bar editing box");
		// Close the browser
		// driver.close();

	}
}
