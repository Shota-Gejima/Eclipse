package firstEclipse;

public class lesson2 {

	public static void main(String[] args) {
		System.out.println("数あてゲームをします");
		int ans = new java.util.Random().nextInt(10);
		for (int i=0; i<5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("あたりです");
				break;
			} else {
				System.out.println("違います");
				if (i==4) {
					System.out.println("答えは"+ans+"です");
				}
			}
		}
		System.out.println("終了します");
	}
}