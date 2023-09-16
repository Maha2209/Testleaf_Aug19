/*Create iOS (Super Class)    
startApp    
increaseVolume   
shutdown
2) Create iPhone extends iOS   
makeCall   
sendSMS
3) Create iPad extends iOS    
watchMovie
4) Create a class (MyPhone) with main method    
Create Object for iPhone    
*/

package week3.day1.inheritancemobile;

public class IOS {
	public void startApp() {
		System.out.println("startApp IOS");
	}

	public void increaseVolume() {
		System.out.println("increaseVolume IOS");
	}

	public void shutdown() {
		System.out.println("shutdown IOS");
	}
}
/*
Confirm you can access 5 methods !!  --> we can access IOS /Iphone method and not IPad method
Confirm you cannot access iPad methods.---> yes we can not access

*/
