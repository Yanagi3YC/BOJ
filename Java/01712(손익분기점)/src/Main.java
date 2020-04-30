import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String cmd = input.nextLine();
		String[] ABC = cmd.split(" ");
		int A = Integer.parseInt(ABC[0]);
		int B = Integer.parseInt(ABC[1]);
		int C = Integer.parseInt(ABC[2]);
		int cProfit = 0;
		int sVolume = 0;
		if (C - B > 0) {
			while (cProfit <= 0) {
				sVolume++;
				cProfit = (C - B) * sVolume - A;
			}
		} else {
			sVolume = -1;
		}
		input.close();
		System.out.print(sVolume);
	}
}