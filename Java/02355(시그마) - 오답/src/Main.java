import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long smallerLong = sc.nextLong();
		long biggerLong = sc.nextLong();
		sc.close();
		long gap = biggerLong - smallerLong;
		long result = 0;
		if (gap % 2 == 0) {
			result = (smallerLong + biggerLong) * (gap / 2) + smallerLong + (gap / 2);
		} else {
			result = (smallerLong + biggerLong) * (gap + 1) / 2;
		}
		System.out.print(result);
	}
}