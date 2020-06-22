import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		sec += sc.nextInt();
		min += sec / 60;
		sec = sec % 60;
		hour += min / 60;
		min = min % 60;
		hour = hour % 24;
		System.out.print(hour + " " + min + " " + sec);
		sc.close();
	}
}
