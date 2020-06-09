import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		sum += sc.nextInt();
		sum += sc.nextInt();
		sum += sc.nextInt();
		sum += sc.nextInt();
		System.out.println(sum / 60);
		System.out.println(sum % 60);
		sc.close();
	}
}
