package week3.day1.LearnAbstraction;

public class OnePlus extends AndroidTV {

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("PlayVideo OnePlus");
		
	}
	public static void main(String[] args) {
		OnePlus oneplus = new OnePlus();
		oneplus.playVideo();
		oneplus.openApp();
	}
}
