package _BaekJoon_12;

import java.util.Scanner;

public class Q1436 {
	public static void main(String args[]) {
		// 영화감독 숌
		// 세상의종말_*666*
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(countNumber(N));
		
		sc.close();
	}
	
	static int countNumber(int n) {
		int number = 666;
		int count = 1;
		
		while(count != n) {
			number++;
			
			String stringNumber = String.valueOf(number);
			
			if (stringNumber.contains("666")) {
				count++;
			}
			
		}
		
		return number;
	}
}
