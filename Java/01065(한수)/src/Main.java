import java.util.Scanner;

class hansu {
	public boolean d(int n) {
		if (n < 100) {
			return true;
		} else {
			if (n / 100 - (n % 100) / 10 == (n % 100) / 10 - n % 10) {
				return true;
			} else {
				return false;
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		hansu hansu = new hansu();
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = 0;
		for (int i = 1; i <= num; i++) {
			if (hansu.d(i) == true) {
				result += 1;
			}
		}
		System.out.println(result);
		input.close();
	}
}
