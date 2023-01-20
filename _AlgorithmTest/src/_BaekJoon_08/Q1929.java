package _BaekJoon_08;

import java.util.Scanner;

public class Q1929 {
	public static void main(String args[]) {
		//소수 구하기
		//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean check = true;
		
		for(int i = M; i <= N; i++) {
			check = true;
			
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			
			if (check) {
				System.out.print(i+"\n");
			}
		} 
		sc.close();
	}
}
