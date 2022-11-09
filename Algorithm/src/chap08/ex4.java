package chap08;

import java.util.Scanner;

public class ex4 {
	static int[] a;
	static int n,m;
	public void DFS(int L ) {
		if(L==m) {
			for(int x: a)System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i=1; i<=n; i++) {
				a[L]=i;
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args) {
		ex4 T = new ex4();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		T.DFS(0);
	}

}
