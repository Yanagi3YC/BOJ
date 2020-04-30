import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		Stack<Integer> stk = new Stack<Integer>();
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		String[] cmds = new String[num];
		for (int i = 0; i < num; i++)
			cmds[i] = input.nextLine();
		for (int i = 0; i < num; i++) {
			String[] cmd = cmds[i].split(" ");
			if (cmd[0].equals("push"))
				stk.push(Integer.valueOf(cmd[1]));
			else if (cmd[0].equals("pop"))
				if (stk.size() == 0)
					System.out.println(-1);
				else
					System.out.println(stk.pop());
			else if (cmd[0].equals("size"))
				System.out.println(stk.size());
			else if (cmd[0].equals("empty"))
				if (stk.size() == 0)
					System.out.println(1);
				else
					System.out.println(0);
			else if (stk.size() == 0)
				System.out.println(-1);
			else
				System.out.println(stk.peek());
		}
		input.close();
	}
}
