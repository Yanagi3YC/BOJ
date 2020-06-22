import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sum_orig = sc.next();
		BigInteger sum = new BigInteger(sum_orig);
		String more_orig = sc.next();
		BigInteger more = new BigInteger(more_orig);
		sc.close();
		System.out.println((sum.subtract(more)).divide(new BigInteger("2")).add(more));
		System.out.print((sum.subtract(more)).divide(new BigInteger("2")));
	}
}
