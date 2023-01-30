import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// A 집합 원소개수
		int m = sc.nextInt();	// B 집합 원소개수
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		
		int count = 0;	// A 집합 원소와 B 집합 원소가 같을 경우 증가할 카운트변수
		
		for(int i = 0; i < m; i++) {
			int number = sc.nextInt();
			
			if(set.contains(number)) {
				count++;
			} else {
				set.add(number);
			}
		}
		
		System.out.println(n + m - (count * 2));	// A 집합과 B 집합의 합집합 - (중복개수 * 2)
		
		sc.close();	
	}
}