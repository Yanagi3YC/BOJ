import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		sum += sc.nextInt();
		sum += sc.nextInt();
		sum += sc.nextInt();
		sum += sc.nextInt();
		sum += sc.nextInt();
		sc.close();
		System.out.print(sum);
	}
}
