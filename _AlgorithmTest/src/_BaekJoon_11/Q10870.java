package _BaekJoon_11;

import java.util.Scanner;

public class Q10870 {
	public static void main(String args[]) {
		// 피보나치 수
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
		
		sc.close();
	}
	
	public static int fibonacci(int n) {
		
		if (n < 1) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
