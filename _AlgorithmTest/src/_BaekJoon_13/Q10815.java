package _BaekJoon_12;

import java.util.Scanner;

public class Q10815 {
	public static void main(String args[]) {
		// 숫자카드
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 상근이 카드 개수
		int[] nArray = new int[N];	// 상근이 카드 배열
		
		for(int i = 0; i < N; i++) {
			nArray[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();		// 딜러 카드 개수
		int[] mArray = new int[M];	// 딜러 카드 배열
		
		for(int i = 0; i < M; i++) {
			mArray[i] = sc.nextInt();
		}
		
		StringBuilder sb = new StringBuilder();
				
		for(int j = 0; j < M; j++) {
			for(int i = 0; i < N; i++) {
				
				if (mArray[j] == nArray[i]) {
					sb.append("1 ");
					break;
				} 
				
				else {
					if (i == N-1) {
						sb.append("0 ");
					}
					
				}
			}
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
