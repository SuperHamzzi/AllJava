package testexam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gongYakSu(a,b));
		System.out.println(gongBeSu(a,b));
	}
	 static int gongYakSu(int a, int b) {
			if(a%b==0) {
				return b;
			}
			return gongYakSu(b,a%b);
	
}
	  static int gongBeSu(int a,int b) {
		 return a*b/gongYakSu(a,b);
	 }
}


