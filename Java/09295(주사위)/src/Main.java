import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		String[] result = new String[r];
		for (int i = 0; i < r; i++) {
			int temp1 = i + 1;
			int temp2 = input.nextInt() + input.nextInt();
			result[i] = "Case " + temp1 + ": " + temp2;
		}
		input.close();
		for (int i = 0; i < r; i++) {
			System.out.println(result[i]);
		}
	}
}
