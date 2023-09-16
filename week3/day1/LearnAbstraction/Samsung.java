package week3.day1.LearnAbstraction;

public class Samsung extends AndroidTV{

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("PlayVideo Samsung");
				
	}
	
	public static void main(String[] args) {
		Samsung sam = new Samsung();
		sam.playVideo();
		sam.openApp();
	}

}
