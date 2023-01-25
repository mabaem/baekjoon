package _BaekJoon_11;

import java.util.Scanner;

public class Q10872 {
	public static void main(String args[]) {
		// 팩토리얼 + 재귀함수
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(factorial(N));
		
		sc.close();
	}
	
	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
}
