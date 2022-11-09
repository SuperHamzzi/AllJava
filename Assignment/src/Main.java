import java.util.Scanner;

class Main {
static int a, b, n; 
static int cases = 0; // 경우의 수

// 나올 수 있는 모든 방법을 계산하고, 그 중 해당하는 경우만큼 cases에 저장하는 함수
static void calc(int score, String oper, int[] arr) {
int i;

if (oper.equals("")) {
calc(0, "+", arr);
calc(0, "-", arr);
return;
}

i = oper.length() - 1;
if (oper.charAt(i) == '+') {
score += arr[i];
} else {
score -= arr[i];
}

if (i < n - 1) {
calc(score, oper + '+', arr);
calc(score, oper + '-', arr);
} else {
	//모든 경우의수를 출력
 System.out.print(oper+" ");
 System.out.println(score);
if (a <= score && score <= b)
cases++;
}
}

public static void main(String args[]) {
int[] card = new int[20]; // 카드가 최대 20장까지 주어진다고 가정
Scanner sc = new Scanner(System.in);

n = sc.nextInt();
for (int i = 0; i < n; i++) {
card[i] = sc.nextInt();
}
a = sc.nextInt();
b = sc.nextInt();
calc(0, "", card);
System.out.println(cases);
sc.close();
}
}