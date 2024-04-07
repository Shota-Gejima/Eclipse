package firstEclipse;

public class Lesson5 {
	public static void main(String[] args) {
		introduceOneself();
		String title = "Hello";
		String address = "aaa@aaa.com";
		String text = "World";
		email(title, address, text);
		email(address, text);
		
		double bottom = 10.0;
		double height = 5.0;
		 double triangleAns = calcTriangleArea(bottom, height);
		
		double radius = 5.0;
		double circleAns = calcCircleArea(radius);
		
		System.out.println("三角形の面積は" + triangleAns + "、" + "円の面積は" + circleAns);
	}	
	public static void introduceOneself() {
		String name = "ゲジ";
		int age = 30;
		double height =163.5;
		char zodiac = '酉';
		System.out.println("私の名前は"+name+"です。身長と年齢と干支は"+height+"、"+age+"、"+age+zodiac+"です");
	}	
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信します。");
		System.out.println("件名："+title);
		System.out.println("本文："+text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文："+ text);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return  (bottom * height) / 2;
	}
//	戻り値
	public static double calcCircleArea(double redius) {
		return redius * redius * 3.14;
	}
}
