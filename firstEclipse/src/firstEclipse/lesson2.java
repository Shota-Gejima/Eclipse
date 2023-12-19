package firstEclipse;

public class lesson2 {

	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(3);
		fortune++;
		System.out.println("占いの結果がでました");
		
		switch (fortune) {
		case 1:
			System.out.println("大吉です");
			break;
		case 2:
			System.out.println("吉です");
			break;
		case 3:
			System.out.println("末吉です");
			break;
		case 4:
			System.out.println("凶です");
		}
	}
}