package firstEclipse.chapter5;

public class lesson5 {

	public static void main(String[] args) {

		introduceOneself();
		System.out.println("");
		email("練習5-2", "aaa@bbb.jp", "javaコード練習");
		email("aaa@bbb", "javaコード練習");
		double triangleArea=calcTriangleArea(3.0, 5.0);
		System.out.println("円の面積は"+triangleArea);
		double circleArea=calcCircleArea(3.0);
		System.out.println("円の面積は"+circleArea);
	}

	//	コード5-1
	public static void introduceOneself() {
		String name = "ゲジ";
		int age = 30;
		double height = 163.5;
		char zodiac = '酉';
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。"
				+ "身長は" + height + "で、" + zodiac + "年です。");
	}

	//	コード5-2
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	//	コード5-3
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名:" + "無題");
		System.out.println("本文:" + text);
	}
//	コード5-4
	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = (bottom*height)/2;
		return triangleArea;
	}
	
	public static double calcCircleArea(double radius) {
		double PI = 3.14;
		double circleArea = radius*radius*PI;
		return circleArea;
	}

}
