package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex1697 {
	int[] dis = { 1, -1, 2 };
	int[] ch;
	int nx = 0;
	Queue<Integer> Q = new LinkedList<>();

	public int BFS(int s, int e) {
		ch = new int[100001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				if (x == e)
					return L;
				for (int j = 0; j < 3; j++) {
					if (j == 2) {
						nx = x * dis[j];
					} else {
						nx = x + dis[j];
					}
					if (nx >= 1 && nx <= 100000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}

		return 0;

	}

	public static void main(String[] args) {
		ex1697 T = new ex1697();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(T.BFS(a, b));

	}

}
