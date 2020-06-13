import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int amount = sc.nextInt();
		int now = sc.nextInt();
		sc.close();
		int result = 0;
		if (now > price * amount) {
			result = 0;
		} else {
			result = price * amount - now;
		}
		System.out.print(result);
	}
}
