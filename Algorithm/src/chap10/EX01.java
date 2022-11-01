package chap10;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int[] dy =new int[N];
		for(int i=0; i<N; i++) {
			if(i==0) dy[0]=1;
			if(i==1) dy[1]=2;
			if(i>1)dy[i]=dy[i-1]+dy[i-2];
		}
		System.out.println(dy[N-1]);
		}

	}


