package BackJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EX1920_2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr  = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		for(int i =0; i<N; i++) {
			arr[i]  =Integer.parseInt(st.nextToken());
		}
		
	}

}
