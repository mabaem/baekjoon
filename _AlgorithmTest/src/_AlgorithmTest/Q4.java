package _AlgorithmTest;

public class Q4 {

	/*
	 * 
	 * Q4. 1부터 n까지 연속한 정수의 곱을 구하는 알고리즘을 만들어 보세요. 
	 * 1 부터 n 까지의 곱, 즉 팩토리얼을 구하는 문제입니다.
	 * 재귀함수를 사용하세요.
	 * 
	 * 
	 */
	public static void main (String args[]) {
		//테스트 입력
		int fact = 10;
		
		System.out.println(factorial(fact));
	}
	
	public static int factorial (int n) {
		
		if (n == 1)
			return 1;
			
		return n * factorial(n-1);
	}
}
