package _BaekJoon_10;

import java.util.Scanner;

public class Q7568 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 사람수, 등수 최대값
		
		int[][] array = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			array[i][0] = sc.nextInt();	// 몸무게
			array[i][1] = sc.nextInt();	// 키
		}
		
		// i번째 사람
		for(int i = 0; i < n; i++) {
			int rank = 1;	// 등수 범위 : 1 ~ n
			
			// i번째 사람과 비교할 j번째 사람
			for(int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				
				if ((array[i][0] < array[j][0]) && (array[i][1] < array[j][1])) {
					rank++;
				}				
			}
			
			System.out.print(rank + " ");
			
		}
		
		sc.close();
		
	}
}
