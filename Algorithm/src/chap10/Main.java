package chap10;

public class Main {
	public static void main(String[] args) {
		int arr[][] = {{1,1,0,1},{0,1,1,0},{1,1,1,0},{1,1,1,1}};
		
		int cnt=0;
		for(int y=1; y<3;y++) {
			for(int x =2; x<4; x++) {
				IF(ARR[Y][X] ==1)CNT++;
			}
			for(int x=0; x<3; x++) {
				if(arr[y][x] ==1) cnt++;
			}
			System.out.println(y);
		}
		System.out.println(cnt);
	}

}
