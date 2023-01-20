package _BaekJoon_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1065 {
	/*
	 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
	 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
	 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
	 * 
	 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
	 */
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(hansu(n));
	}
	
	public static int hansu(int number) {
		int cnt = 0;	//카운팅용 변수
		
		if (number < 100) {	//입력된 수가 1~99이면 모두 한수이므로 입력된 값을 반환
			return number;
		}
		else {	//입력된 수가 100~1000인 경우 각각의 자릿수를 구하여 한수인지 확인하여 cnt증가
			cnt = 99;	//cnt 99로 초기화(최소 99개 이므로)
			
			for (int i=100; i<=number; i++) {
				int a = i / 100;		//첫번째 수(100의 자릿수)
				int b = (i / 10) % 10;	//두번째 수(10의 자릿수)
				int c = i % 10;			//세번째 수(1의 자릿수
				
				if ((a-b) == (b-c)) {	//각 자릿수가 등차수열인지 체크하여 cnt 증가
					cnt++;
				}
			}
		}
		
		return cnt;
	}
}
