import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();
		int q = 0;
		if (x > 0) {
			if (y > 0) {
				q = 1;
			} else {
				q = 4;
			}
		} else {
			if (y > 0) {
				q = 2;
			} else {
				q = 3;
			}
		}
		System.out.print(q);
	}
}
