import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String[] line = new String[8];
		int count = 0;
		for (int i = 0; i < 8; i++) {
			line[i] = br.readLine();
		}
		for (int i = 0; i < 8; i++) {
			String text = line[i];
			if (i % 2 == 0) {
				for (int j = 0; j < 8; j += 2) {
					if (text.charAt(j) == 'F') {
						count++;
					}
				}
			} else {
				for (int j = 1; j < 8; j += 2) {
					if (text.charAt(j) == 'F') {
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}
}
