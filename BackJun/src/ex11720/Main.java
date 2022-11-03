package ex11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int sum=0;
		for(char x: b.toCharArray()) {
			sum += x-'0';
		}
		System.out.println(sum);
	}

}
