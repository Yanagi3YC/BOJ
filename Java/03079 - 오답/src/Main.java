import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int left = Integer.MAX_VALUE;
		int right = Integer.MIN_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int people = Integer.parseInt(st.nextToken());

		int[] officers = new int[num];
		int cur;

		for (int i = 0; i < officers.length; i++) {
			cur = Integer.parseInt(br.readLine());
			if (cur < left) {
				left = cur;
			}
			if (right < cur) {
				right = cur;
			}
			officers[i] = cur;
		}

		int answer = 0;
		right = right * people;
		int throughput;
		int mid;
		while (left <= right) {
			throughput = 0;
			mid = (left + right) / 2;
			for (int officer : officers) {
				throughput = throughput + (mid / officer);
			}
			if (throughput < people) {
				left = mid + 1;
			} else {
				answer = mid;
				right = mid - 1;
			}
		}
		br.close();
		System.out.print(answer);
	}
}
