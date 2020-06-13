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
		for (int i = 0; i < 3; i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int[] startTime = new int[3];
			int[] endTime = new int[3];
			int[] workTime = new int[3];
			for (int j = 0; j < 3; j++) {
				startTime[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < 3; j++) {
				endTime[j] = Integer.parseInt(st.nextToken());
			}
			if (endTime[2] < startTime[2]) {
				endTime[1]--;
				endTime[2] += 60;
			}
			workTime[2] = endTime[2] - startTime[2];
			if (endTime[1] < startTime[1]) {
				endTime[0]--;
				endTime[1] += 60;
			}
			workTime[1] = endTime[1] - startTime[1];
			workTime[0] = endTime[0] - startTime[0];
			if (workTime[0] < 0) {
				workTime[0] += 24;
			}
			for (int w : workTime) {
				bw.write(w + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
