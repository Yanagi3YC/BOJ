import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num = br.readLine();
		long remain = 0;
		for (int i = 0; i < num.length(); i++) {
			remain = (remain * 10 + (num.charAt(i) - '0')) % 20000303;
		}
		bw.write(Long.toString(remain));
		bw.close();
	}
}