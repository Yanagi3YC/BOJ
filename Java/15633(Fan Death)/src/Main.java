import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int result = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				result += i;
			}
		}
		System.out.print(result * 5 - 24);
	}
}
