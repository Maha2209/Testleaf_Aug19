package week3.day1.assign;

public abstract class MultipleLangauge implements Language, TestTool {

	public void python() {
		System.out.println(
				"This Phyton methdod is from Abstract class MultipleLangauge which implements Interface(Language, TestTool)");
	}

	public abstract void ruby();

}
