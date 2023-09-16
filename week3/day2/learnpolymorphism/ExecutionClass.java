package week3.day2.learnpolymorphism;

public class ExecutionClass {
	public static void main(String[] args) {
		BrowserImplementation bi = new BrowserImplementation();
		bi.startApp();
		bi.loadURL("http://leaftaps.com/opentaps/control/main");
	//	bi.close();
		bi.startApp("chrome");
		bi.quit(); //-it will close only chorme
	

	

	}

}
