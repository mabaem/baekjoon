package _BaekJoon_12;

import java.util.Scanner;

public class Q2231 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 분해합
		
		int min = 0;
		
		for(int i = 0; i < n; i++) {
			
			int sum = 0;
			int x = i;
			
			while (x != 0) {
				// 각 자리수 더하기
				sum += (x % 10);
				
				// 1의 자리수가 될 때까지 10씩 나누기
				x = x / 10;
			}
			
			// 자기자신 더하기
			sum += i;
			
			if (sum == n) {
				min = i;
				break;
			}
						
		}
		
		System.out.println(min);
				
		sc.close();
	}
}
