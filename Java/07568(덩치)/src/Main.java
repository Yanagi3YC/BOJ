import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][];
		for (int i = 0; i < num; i++) {
			String[] line = br.readLine().split(" ");
			arr[i] = new int[2];
			arr[i][0] = Integer.parseInt(line[0]);
			arr[i][1] = Integer.parseInt(line[1]);
		}
		for (int i = 0; i < num; i++) {
			int count = 0;
			int[] nowArr = arr[i];
			for (int j = 0; j < num; j++) {
				int[] compareArr = arr[j];
				if (j != i) {
					if (nowArr[0] < compareArr[0] && nowArr[1] < compareArr[1]) {
						count++;
					}
				}
			}
			System.out.print(count + 1 + " ");
		}
	}
}
