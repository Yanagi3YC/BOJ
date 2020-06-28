import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int leftInteger = Integer.parseInt(st.nextToken());
			int rightInteger = Integer.parseInt(st.nextToken());
			if (leftInteger == 0 && rightInteger == 0) {
				break;
			} else {
				if (leftInteger > rightInteger) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
