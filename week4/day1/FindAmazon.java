package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.lang.Integer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile", Keys.ENTER);
		List<WebElement> links = driver.findElements(By.className("a-price-whole"));
		int size = links.size();
		System.out.println("Total no of links in this page  : " + size);
		WebElement secondEleLink = links.get(2);
		String text = secondEleLink.getText();
		// System.out.println("Total Mobile prices displayed " + links);

		System.out.println("Second element " + text);

		List<Integer> list = new ArrayList<>();

		for (WebElement each : links) {
			String text1 = each.getText().replace(",", "");

			int mobileprices = Integer.parseInt(text1);
			list.add(mobileprices);

		}
		System.out.println("BEFORE SORTING " + list);
		Collections.sort(list);
		System.out.println("AFTER SORTING " + list);

		System.out.println("LOWEST PRICE " + list.get(0));
		System.out.println("HIGHEST PRICE " + list.get(size - 1));

		Set<Integer> unique = new LinkedHashSet<>(list);
		if (list.size() != unique.size()) {
			System.out.println("Duplicate is present");

		} else {
			System.out.println("No Duplicate is present");
		}
		System.out.println("After removing duplicates" + unique);
		/*
		 * //to find links List<WebElement> links =
		 * driver.findElements(By.tagName("a"));
		 * 
		 * //to find the number of links int size = links.size();
		 * System.out.println("Total no:of links in this page  : "+size);
		 * 
		 * //to retrieve a particular link out of all links // WebElement secondEleLink
		 * = links.get(2); // String text = secondEleLink.getText(); //
		 * System.out.println(text);
		 * 
		 * System.out.println(links.get(2).getText());
		 * 
		 * //to print all links // for (int i = 0; i <size; i++) { // String text =
		 * links.get(i).getText(); // System.out.println(text); // }
		 * 
		 * // Declare a List List<String> list = new ArrayList<>(); //use for each loop
		 * // datatype variable: data for (WebElement each : links) { String text =
		 * each.getText(); list.add(text); } //to sort a list Collections.sort(list);
		 * System.out.println(list);
		 */
	}

}
