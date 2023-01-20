package _BaekJoon_10;

import java.util.Scanner;

public class Q2587 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5]; 
		int temp;
		
		int sum = 0;
		int avg;
		
		// 입력부분
		for(int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			
			sum += array[i];
		}
		
		// 정렬부분
		for(int i = 4; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}				
			}
		}
		
		// 출력부분
		avg = sum / 5;
		
		System.out.println(avg);
		System.out.println(array[2]);
		
		sc.close();
	}
}
