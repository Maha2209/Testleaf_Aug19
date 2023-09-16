/*
Create an Interface for Android
Open an App (openApp)
Watch Video (playVideo)
Implement using interface, abstract class
Android (Interface)
AndroidTV (Abstract class) – implement only openApp
Samsung, OnePlus (Concrete Class) – implement the missing method
 
 * */

package week3.day1.LearnAbstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserImplementation extends Reporter implements Browser, Element

/*error : wrong sysntax first extends then only implements
public class BrowserImplementation  implements Browser, Element extends Reporter
*/

{
	public ChromeDriver driver;

	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		// ChromeDriver driver = new ChromeDriver(); if i use here i can not driver only with startapp not in any other method
		driver = new ChromeDriver();

	}

	@Override
	public void startReporter() {
		// TODO Auto-generated method stub
		System.out.println("startReporter");
	}

	@Override
	public void loadURL(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}


	public void close() {
		// TODO Auto-generated method stub
		driver.close();

	}

	public static void main(String[] args) {
		BrowserImplementation bi = new BrowserImplementation();
		bi.startApp();
		bi.loadURL("http://leaftaps.com/opentaps/control/main");
		bi.close();
		bi.startReporter();
		bi.takeSnap();

	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub
		System.out.println("take snap");

	}

	@Override
	public void LocateElement() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

}
