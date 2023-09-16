package week3.day1.assign;

public class Automation extends MultipleLangauge implements Language, TestTool {

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("This Selenium methdod is from Interface");
	}

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("This Java methdod is from Interface Language");

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("This ruby methdod is from Abstract Class Multiple Language");

	}

	public static void main(String[] args) {
		Automation au =new Automation();
		au.Selenium();
		au.Java();
		au.ruby();
		au.python();
	}
}
