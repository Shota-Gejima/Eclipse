package firstEclipse;

public class MethodPractice {
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i= 0; i<newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[] array = makeArray(5);
		for (int ans : array) {
			System.out.println(ans);
		}
		
	}
}

