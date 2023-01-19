package _BaekJoon;

import java.util.Scanner;

public class Q25305 {
	public static void main(String args[]) {
		// 커트라인
		
		Scanner sc = new Scanner(System.in);
		
		// 입력부분
		int N = sc.nextInt();	// 응시자 수
		int k = sc.nextInt();	// 상을 받는 사람 수
		
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		int temp;	
		
		// 정렬부분
		for(int i = N - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				
				// 내림차순 정렬
				if (array[j] < array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}				
			}
		}
		
		// 출력부분
		System.out.println(array[k-1]);
		
		sc.close();
	}
}
