import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		String[] inputs = new String[num];
		String result = "";
		for (int i = 0; i < num; i++) 
			inputs[i] = input.nextLine();
		for (int i = 0; i < num; i++) {
			BigInteger temp = new BigInteger(inputs[i]);
			if (temp.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)))
				result += "even\n";
			else
				result += "odd\n";
		}
		System.out.print(result);
		input.close();
	}
}
