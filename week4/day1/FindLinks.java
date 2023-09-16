package week4.day1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

public class FindLinks {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// to find Links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// to find the number of links
		int size = links.size();
		System.out.println(size);

		// to retrieve a particular link out of all links.

		WebElement secondEleLink = links.get(2);
		String text = secondEleLink.getText();
		System.out.println(text);

		// System.out.println(links.get(2).getText());

		// to print all the links.

		/*
		 * for (int i = 0; i <= size; i++) { String str = links.get(i).getText();
		 * 
		 * }System.out.println(str);
		 */

		// declare a list
		List<String> list = new ArrayList<>();

		// for each loop
		for (WebElement each : links) {
			String text1 = each.getText();
			list.add(text1);

		}
		// to sort the list using collections class
		// pls not collection is a interface where collections is a class
		Collections.sort(list);
		System.out.println(list);

	}
}