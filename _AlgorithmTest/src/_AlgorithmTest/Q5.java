package _AlgorithmTest;

public class Q5 {

	/*
	 * 
	 * Q5. 두 자연수 a 와 b 의 최대공약수를 구하는 알고리즘을 만들어보세요. 
	 * 두 수의 약수 중에서 공통된 것을 찾아 그 값중 최댓값인 것을 찾아야 합니다. 
	 * 약수란 나누어 떨어지는 값입니다.
	 * 
	 * 유클리드 알고리즘 : a와 b의 최대공약수는 'b'와 'a를 b로 나눈 나머지'의 최대 공약수와 같다. 
	 * gcd(a, b) = gcd(b, a % b)
	 * 재귀함수를 사용하세요.
	 * 
	 * 
	 */
	
	public static void main (String args[]) {
		//테스트 입력
		int result = gcd(30,12);
		
		System.out.println("gcd(30,12) = "+result);		
	}
	
	public static int gcd(int a, int b) {
		
		//나누었을 때 뒤의 인자가 0이 되면 앞의 인자가 최대공약수이다.
		//재귀함수 종료
		if (b == 0)
			return a;
		
		//나누었을 때 인자가 1이 되면 둘 사이의 최대공약수는 없다.
		//재귀함수 종료
		if (a == 1 || b == 1)
			return 1;
		
		//유클리드 알고리즘으로 재귀함수 호출
		if (a > b)
			return gcd(b, a%b);
		else 
			return gcd(a, b%a);
		
	}
}
