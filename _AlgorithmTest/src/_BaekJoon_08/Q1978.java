package _BaekJoon_08;

import java.util.Scanner;

public class Q1978 {
	
	public static void main(String args[]) {
		//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int number;
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			number = sc.nextInt();
			
			for(int j = 2; j <= number; j++) {
				if (j == number) {
					count++;
				}
				if (number % j == 0) {
					break;
				}
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
	
}
