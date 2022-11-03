package ex11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int a; int b;
		StringTokenizer st;
		for(int i=1; i<=T; i++) {
			 st=new StringTokenizer(br.readLine()," ");
			 a=Integer.parseInt(st.nextToken());
			 b=Integer.parseInt(st.nextToken());
			 System.out.println("Case #"+(i)+": "+a+" + " +b+"= "+(a+b));
		}
		
		br.close();
	}

}
