
package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class RelationXpath {
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://www.nykaa.com/");

		// maximize the window
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//form[@class='css-19j7d8y']/input[@name='search-suggestions-nykaa']"));
		driver.findElement(By.xpath("//form/input[@name='search-suggestions-nykaa']"));
		driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']/parent::form"));
		driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']/parent::form[@class='css-19j7d8y']"));

	}
}
/*
 * Classroom Activity: Load nykaa.com Write parent to child and child to parent
 * xpath for search field
 */
