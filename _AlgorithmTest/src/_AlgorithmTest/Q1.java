package _AlgorithmTest;

import java.util.Scanner;

public class Q1 {
	
	/*
	 * Q.1 1 부터 n 까지 연속한 정수의 합을 구하는 알고리즘을 만들어보세요. n 은 콘솔을 통해 입력 받습니다.
	 * 
	 * 결과값의 예는 다음과 같습니다.
	 * 
	 * 1~10 : 55 1~100 : 5050
	 */
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int result = sum(n);
		
		System.out.println("1부터 "+n+"까지의 정수의 합 : "+result);
		
		sc.close();
	}
	
	public static int sum(int n) {
		int result = 0;
		
		for (int i=1; i<=n; i++)
			result += i;
		
		return result;
	}
}
