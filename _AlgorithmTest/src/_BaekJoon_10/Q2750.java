package _BaekJoon_10;

import java.util.Scanner;

public class Q2750 {
	public static void main(String args[]) {
		// 수 정렬하기 - Bubble Sort
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 테스트 케이스
		int[] array = new int[N];
		int temp;
		
		// 입력부분
		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		// 정렬부분
		for(int i = N - 1; i > 0; i--) { 
			for(int j = 0; j < i; j++) {
				
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
		
		// 출력부분
		for(int i = 0; i < N; i++) {
			System.out.println(array[i]);
		}
		
		sc.close();
	}
}
