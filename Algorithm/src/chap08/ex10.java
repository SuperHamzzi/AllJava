package chap08;

import java.util.Scanner;

public class ex10 {
	static int[][] arr;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1 };
	static int answer=0;
	public void DFS(int n, int m) {
		if(n==7 && m==7) { answer++;
		}else{
			for(int i=0; i<=3; i++) {
				int nx= n+dx[i];
				int ny= m+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && arr[nx][ny]==0) {
					arr[nx][ny]=1;
					DFS(nx,ny);
					arr[nx][ny]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ex10 T = new ex10();
		
		Scanner sc = new Scanner(System.in);
		arr = new int[8][8];
		for(int i=1; i<=7; i++) { 
		for(int j=1; j<=7; j++){
		
			arr[i][j]= sc.nextInt();
			
		}
		}
		arr[1][1]=1;
		T.DFS(1,1);
		System.out.print(answer);
	}
}
