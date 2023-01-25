package _BaekJoon_12;

import java.util.Scanner;

public class Q2798 {
	public static void main(String agrs[]) {
		// 블랙잭
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 카드 개수
		int m = sc.nextInt();	// 3장의 카드의 합의 최대값
		
		int[] cardArray = new int[n];	// 카드 배열
		for(int i = 0; i < n; i++) {
			cardArray[i] = sc.nextInt();
		}
		
		int sum = 0, result = 0;	// sum:3장의 카드의 합, result:m과 가장 가까운 sum의 값
		
		for(int i = 0; i < n - 2; i++) {
			
			if (cardArray[i] > m) {
				continue;
			}
			
			for(int j = i + 1; j < n - 1; j++) {
				
				if (cardArray[i] + cardArray[j] > m) {
					continue;
				}
								
				for(int k = j + 1; k < n; k++) {
					
					sum = cardArray[i] + cardArray[j] + cardArray[k];
					
					if (sum > m) {
						continue;
					}
					else {
						
						if (sum > result) {
							result = sum;
						}
						
					}
					
				}
				
			}
			
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
