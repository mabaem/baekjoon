package _BaekJoon;

import java.util.Scanner;

public class Q9020 {
	
	public static boolean[] prime = new boolean[10001];
	 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		get_prime();
 
		int T = sc.nextInt();	// 테스트케이스
 
		while (T-- > 0) {
			int n = sc.nextInt();
			int firstPartition = n / 2;
			int secondPartition = n / 2;
 
			while (true) {
            
				// 두 파티션이 모두 소수일 경우
				if (!prime[firstPartition] && !prime[secondPartition]) {
					System.out.println(firstPartition + " " + secondPartition);
					break;
				}
				firstPartition--;
				secondPartition++;
			}
		}
		
		sc.close();
	}
 
	// 에라토스테네스의 체
	public static void get_prime() {
		prime[0] = prime[1] = true;
 
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
 
}