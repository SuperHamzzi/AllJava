import java.util.Scanner;

class Main4 {
static int a, b, n;
static int cases = 0; 
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

if (a <= score && score <= b)
cases++;
}
}

public static void main(String args[]) {
int[] card = new int[20]; 
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