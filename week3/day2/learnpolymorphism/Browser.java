package week3.day2.learnpolymorphism;

public interface Browser {

	/* This method should launch the Chrome browser */

	public void startApp();
	/* This method should launch any browser */
	
	public void startApp(String browser);

	// **This method should load the application in the specified browser

	public void loadURL(String url);

	// This method should close the browser.
	public void quit();

}
