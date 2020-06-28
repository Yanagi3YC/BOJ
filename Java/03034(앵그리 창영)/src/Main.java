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
		String firstLineInput = br.readLine();
		StringTokenizer st = new StringTokenizer(firstLineInput);
		int numberOfMatch = Integer.parseInt(st.nextToken());
		int widthOfBox = Integer.parseInt(st.nextToken());
		int heightOfBox = Integer.parseInt(st.nextToken());
		double pitagoraSum = Math.pow(widthOfBox, 2) + Math.pow(heightOfBox, 2);
		for (int i = 0; i < numberOfMatch; i++) {
			int token = Integer.parseInt(br.readLine());
			if (Math.pow(token, 2) <= pitagoraSum) {
				bw.write("DA\n");
			} else {
				bw.write("NE\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
