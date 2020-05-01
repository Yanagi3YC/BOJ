import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		for (int i = 0; i < 5; i++) {
			int temp = input.nextInt();
			a += temp * temp;
		}
		input.close();
		System.out.print(a % 10);
	}
}
