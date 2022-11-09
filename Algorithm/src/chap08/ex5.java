package chap08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;




public class ex5 {
	static int N,M,answer=Integer.MAX_VALUE;
	public void DFS(int n,int m,Integer[] arr) { //n:동전개수 b: 합계 m:거슬러줄금액
		if(m>M) return;
		if(n>=answer) return;
		if(m==M) {
			answer=Math.min(answer, n);
		}else {
			for(int i=0;i<N;i++) {
				DFS(n+1,m+arr[i],arr);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex5 T = new ex5();	
		N = sc.nextInt();
			Integer[] arr = new Integer[N];
			for(int i=0; i<3; i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr, Collections.reverseOrder());
			M = sc.nextInt();
			T.DFS(0,0,arr);
			System.out.println(answer);
	}

}
