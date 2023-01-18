package _BaekJoon;

import java.util.Scanner;

public class Q11653 {	
	public static void main(String args[]) {
		// 소인수분해
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x = N;
		
		for(int i = 2; i <= x; i++) {	
			while (x % i == 0) {
				System.out.println(i);
				x = x / i;
			}
		}
		sc.close();
	}
}
