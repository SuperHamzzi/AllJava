package chap08;

import java.util.Scanner;

public class ex3 {
	static int answer=Integer.MIN_VALUE,N,M;
	
	public void DFS(int L,int sum,int time,int[] ps,int[] pt) {
		if(time>M) return;
		if(L==N) {
			answer =Math.max(answer, sum);
		}else {
			DFS(L+1,sum+ps[L],time+pt[L],ps,pt);
			DFS(L+1, sum,time,ps,pt);
		}
	}
	
	public static void main(String[] args) {
	ex3 T = new ex3();
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	M = sc.nextInt();
	int[] arr = new int[N];
	int[] arr2 = new int[N];
	for(int i=0; i<N; i++) {
		arr[i] = sc.nextInt();
		arr2[i] = sc.nextInt();
	}
	T.DFS(0,0,0,arr,arr2);
	System.out.println(answer);
	
	
	}
}
