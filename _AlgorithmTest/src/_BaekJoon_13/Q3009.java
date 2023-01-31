package _BaekJoon_13;
import java.util.Scanner;

public class Q3009 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int resultX = 0, resultY = 0;
		
		// x좌표 검증
		if(x[0] == x[1]) {
			resultX = x[2];
		} else if(x[1] == x[2]) {
			resultX = x[0];
		} else {
			resultX = x[1];
		}
		
		// y좌표 검증
		if(y[0] == y[1]) {
			resultY = y[2];
		} else if(y[1] == y[2]) {
			resultY = y[0];
		} else {
			resultY = y[1];
		}
		
		System.out.println(resultX + " " + resultY);

		sc.close();
	}
}
