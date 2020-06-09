import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int b = a % 5;
		if (b != 0) {
			b = 1;
		}
		System.out.print(a / 5 + b);
	}
}
