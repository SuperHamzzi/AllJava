package chap08;

import java.util.Scanner;






public class ex2 {
	static int answer=Integer.MIN_VALUE, C, N;
	public void DFS(int L, int sum, int[] arr) {
		if(sum>C) return;
		if(L==N) {
			answer=Math.max(answer, sum);
		}else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}


		
	}
	public static void main(String[] args) {
	ex2 T = new ex2();
	Scanner sc = new Scanner(System.in);
	C =sc.nextInt();
	N = sc.nextInt();
	int[] arr = new int[N];
	for(int i=0; i<N; i++) {
		arr[i] = sc.nextInt();
	}
	T.DFS(0,0,arr);
	System.out.println(answer);
			

	
	
	
	}
}
