package firstEclipse;

public class Lesson5 {

	public static void main(String[] args) {
		introduceOneself();
		System.out.println("");
		email("おはよう", "aaa@aaa.com", "寒い");
		System.out.println("");
		email("bbb@bbb.com", "めっちゃ寒い");
		System.out.println("");
		double ansTriangle = calcTriangleArea(10.0,5.0);
		double ansCircle = calcCircleArea(5.0);
		
		System.out.println("三角形の面積は" + ansTriangle +"㎠です。");
		System.out.println("円の面積は" + ansCircle +"㎠です。");
		
	}
	public static void introduceOneself() {
		String name = "ゲジ";
		int age = 30;
		double height = 163.5;
		char zodiac = '酉';
		
		System.out.println("私は" + name +"です。"+"年齢は"+ age +"歳です。" + zodiac+"年です。"
				+ "身長は"+ height+"cmです。");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名:無題");
		System.out.println("本文:"+text);
	}
	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom * height / 2;
		return ans;
	}
	
	public static double calcCircleArea(double redius) {
		double ans = redius * redius * 3.14;
		return ans;
	}
}
