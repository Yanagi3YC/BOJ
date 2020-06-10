import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		BigInteger c = BigInteger.ONE;
		BigInteger d = BigInteger.ONE;
		for (int i = 0; i < b; i++) {
			c = c.multiply(new BigInteger(Long.toString(a - i)));
		}
		for (int i = 0; i < b; i++) {
			d = d.multiply(new BigInteger(Long.toString(b - i)));
		}
		bw.write(c.divide(d).toString());
		bw.flush();
		bw.close();
	}
}
