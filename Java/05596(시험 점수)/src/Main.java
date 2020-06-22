import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minguk = 0;
		for (int i = 0; i < 4; i++) {
			minguk += sc.nextInt();
		}
		int manse = 0;
		for (int i = 0; i < 4; i++) {
			manse += sc.nextInt();
		}
		sc.close();
		int result = 0;
		if (minguk > manse) {
			result = minguk;
		} else {
			result = manse;
		}
		System.out.print(result);
	}
}
