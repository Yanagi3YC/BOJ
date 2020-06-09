import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][];
		for (int i = 0; i < num; i++) {
			String[] line = br.readLine().split(" ");
			arr[i] = new int[2];
			arr[i][0] = Integer.parseInt(line[0]);
			arr[i][1] = Integer.parseInt(line[1]);
		}
		/*
		 * for (int i = num - 1; i > 0; i--) { for (int j = 0; j < i; j++) { int[] now =
		 * arr[j]; int[] cmp = arr[j + 1]; if (now[0] > cmp[0] || (now[0] == cmp[0] &&
		 * now[1] > cmp[1])) { arr[j + 1] = now; arr[j] = cmp; } } }
		 */
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		for (int[] a : arr) {
			for (int b : a) {
				bw.write(b + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
