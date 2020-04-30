import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int temp = input.nextInt();
			if (temp < 40) {
				temp = 40;
			}
			sum += temp;
		}
		input.close();
		System.out.print(sum / 5);
	}
}
