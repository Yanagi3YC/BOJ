import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tracks = sc.nextInt();
		int average = sc.nextInt();
		sc.close();
		System.out.print(tracks * (average - 1) + 1);
	}
}
