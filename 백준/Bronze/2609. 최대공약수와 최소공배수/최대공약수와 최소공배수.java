import java.util.Scanner;

public class Main {
	 public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int max = 0;	//최대공약수
		for (int i = 1; (i <= a) && (i <= b); i++) {
			if ((a % i == 0) && (b % i == 0)) {
				max = i;
			}
		}
		
		int min = (a * b) / max;	//최소공배수
		
		System.out.println(max);
		System.out.println(min);
	}
}