import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] init = br.readLine().split(" ");
		int numOfPoke = Integer.parseInt(init[0]);
		int numOfProb = Integer.parseInt(init[1]);
		List<String> list = new ArrayList<String>();
		list.add("0");
		for (int i = 1; i <= numOfPoke; i++) {
			String token = br.readLine();
			list.add(token);
		}
		for (int i = 0; i < numOfProb; i++) {
			String token = br.readLine();
			char firstLetter = token.charAt(0);
			if (firstLetter >= 65 && firstLetter <= 132) {
				bw.write(list.indexOf(token) + "\n");
			} else {
				bw.write(list.get(Integer.parseInt(token)) + "\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
