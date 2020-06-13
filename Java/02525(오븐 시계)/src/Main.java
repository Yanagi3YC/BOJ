import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int spendTime = sc.nextInt();
		sc.close();
		hour += spendTime / 60;
		minute += spendTime % 60;
		if (minute >= 60) {
			hour++;
			minute -= 60;
		}
		while (hour >= 24) {
			hour -= 24;
		}
		System.out.print(hour + " " + minute);
	}
}
