package firstEclipse;

public class lesson4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] moneyList = {121902,8302,55100};
		
		for (int i=0; i < moneyList.length; i++) {
			System.out.print(moneyList[i]+ " ");
		}
		System.out.println("");
		for (int ans : moneyList) {
			System.out.print(ans+" ");
		}
		int [] numbers = {3, 4, 9};
		System.out.println("1文字の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int ans : numbers) {
			if (ans == input) {
				System.out.println("あたり");
			}
		}
	}

}
