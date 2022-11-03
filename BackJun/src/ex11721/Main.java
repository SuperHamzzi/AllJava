package ex11721;

public class Main {
	public static void main(String[] args) {
	String str = "11011";
	
	int sum =0;
	for(int i=0; i<str.length(); i++) {
		sum = sum *2 + (str.charAt(i)-'0');
	}
	System.out.println(sum);
		
	}
	}