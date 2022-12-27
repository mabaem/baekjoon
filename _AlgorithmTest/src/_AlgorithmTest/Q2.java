package _AlgorithmTest;

import java.util.Scanner;

public class Q2 {
	
	/*
	 * 주어진 숫자 n 개 중 가장 큰 숫자를 찾는 알고리즘을 만들어보세요. 숫자는 무작위로 콘솔을 통해 입력받습니다.
	 * 
	 * 데이터의 예는 다음과 같습니다.
	 * 
	 * 17, 92, 18, 33, 58, 7, 33, 42 가 주어졌을 때, 가장 큰 수는 92
	 */
	
	public static void main(String args[]) {
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비교할 숫자 개수 입력 : ");
		n = sc.nextInt();

		int[] numbers = new int[n];
		
		System.out.println("----------------");
		System.out.printf("숫자 %d개 입력 : ", n);
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int result = max(numbers);
		
		System.out.println("----------------");
		System.out.printf("가장 큰 수 : %d\n", result);
		
		sc.close();
		
	}
	
	public static int max(int[] numbers) {
		int result = numbers[0];
		
		for (int j = 0; j < numbers.length; j++) {
			
			if (result >= numbers[j]) {
				continue;
			} else {
				result = numbers[j];
			}
		}
		
		return result;
	}
}
