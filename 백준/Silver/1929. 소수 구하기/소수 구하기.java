import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean check[] = new boolean[N+1];
		check[0] = check[1] = true;
		int sqrt = (int) Math.sqrt(N);
		
		for(int i = 2; i <= sqrt; i++) {
			for(int j = 2; j <= (N / i); j++) {
				if (check[i * j] == true) {
					continue;
				} else {
					check[i * j] = true;
				}
			}
		} 
		
		for(int i = M; i <= N; i++) {
			if(check[i] == false) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}