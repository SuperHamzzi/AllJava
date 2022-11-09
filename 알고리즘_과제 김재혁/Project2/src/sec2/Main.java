package sec2;

import java.util.Scanner;

class Main {
static int a, b, n;
static int cases = 0; 
static void DFS(int score, String comp, int[] arr) {
int i;

if (comp.equals("")) {
DFS(0, "+", arr);
DFS(0, "-", arr);
return;
}

i = comp.length() - 1;
if (comp.charAt(i) == '+') {
score += arr[i];
} else {
score -= arr[i];
}

if (i < n - 1) {
DFS(score, comp + '+', arr);
DFS(score, comp + '-', arr);
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
DFS(0, "", card);
System.out.println(cases);
sc.close();
}
}
