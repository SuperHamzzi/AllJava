package BackJun;

import java.util.Arrays;
import java.util.Scanner;

public class EX1920_1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] arr =new int[N];
	
	for(int i=0; i<N; i++) {
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	
	int M = sc.nextInt();
	int[] arr2 =new int[N];
	
	StringBuilder sb = new StringBuilder();
	
	for(int i=0; i<M; i++) {
		if(search(arr,sc.nextInt())>=0) {
			sb.append(1).append('\n');
		}else {
			sb.append(0).append('\n');
		}
	}
	System.out.println(sb);	
	}

	private static int search(int[] arr, int key) {
		
		int lt =0; int rt=arr.length -1;
		
		while(lt<=rt) {
			int mid = (lt +rt)/2;
			
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]){
				rt = mid-1;
			}else {
				lt = mid +1;
			}
			
		}
		return -1;
		
		
	}
}