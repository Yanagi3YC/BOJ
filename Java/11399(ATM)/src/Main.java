import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] wait = new int[num];
		int time = 0;
		for (int i = 0; i < num; i++) {
			wait[i] = input.nextInt();
		}
		input.close();
		Arrays.sort(wait);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				time += wait[j];
			}
		}
		System.out.print(time);
	}
}
