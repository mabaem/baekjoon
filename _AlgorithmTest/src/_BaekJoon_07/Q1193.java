package _BaekJoon_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193 {
	/*
	무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
	
	1/1	1/2	1/3	1/4	1/5	…
	2/1	2/2	2/3	2/4	…	…
	3/1	3/2	3/3	…	…	…
	4/1	4/2	…	…	…	…
	5/1	…	…	…	…	…
	…	…	…	…	…	…
	이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 
	차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
	
	X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
	
	첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
	첫째 줄에 분수를 출력한다.
	*/
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		fractionList(X);
	}
	
	public static void fractionList(int X) {
		int crossCount = 1; //대각선 개수
		int countSum = 0; //대각선 누적합
		 
		while (true) {
			
			if (X <= countSum + crossCount) {	
				// 대각선 개수 : 홀수
				if (crossCount % 2 == 1) {	
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((crossCount - (X - countSum - 1)) + "/" + (X - countSum));
					break;
				} 
				// 대각선 개수 : 짝수 
				else {	
					System.out.print((X - countSum) + "/" + (crossCount - (X - countSum - 1)));
					break;
				}
 
			} else {
				countSum += crossCount;
				crossCount++;
			}
		}
	}

}
