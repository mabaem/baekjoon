package _BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Q10757 {
	//큰 수 A+B
	//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();		
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B));
		
		sc.close();
	}
}
