import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		input.nextLine();
		for (int i = 0; i < N; i++) {
			set.add(input.nextLine());
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			String token = input.nextLine();
			if (set.contains(token)) {
				count++;
			}
		}
		input.close();
		System.out.print(count);
	}
}
