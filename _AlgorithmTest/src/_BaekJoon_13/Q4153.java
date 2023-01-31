package _BaekJoon_13;

import java.util.Scanner;

public class Q4153 {
	public static void main(String args[]) {
		// 피타고라스 정리
		Scanner sc = new Scanner(System.in);
	
		int x, y, z;
		
		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			
			if((x == 0) && (y == 0) && (z == 0)) {
				break;
			}
			
			if((x * x) + (y * y) == (z * z)) {
				System.out.println("right");
			} else if((x * x) + (z * z) == (y * y)) {
				System.out.println("right");
			} else if((y * y) + (z * z) == (x * x)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}
}
