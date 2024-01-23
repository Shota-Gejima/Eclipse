package firstEclipse;

public class Calculation {

	public static void main(String[] args) {
		System.out.println("あなたの名前を教えて下さい");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を教えて下さい");
		int age = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("ようこそ"+age+"歳の"+name+"さん!");
		
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたは多分"+r+"歳です");
	}

}
