package week3.day1.inheritancemobile;

public class MyPhone {
	public static void main(String[] args) {
		IPhone ip =new IPhone();
		ip.startApp();
		ip.increaseVolume();
		ip.shutdown();
		ip.makeCall();
		ip.sendSMS();
		//ip.watchMovie();->The method watchMovie() is undefined for the type IPhone 
		
	}

}
