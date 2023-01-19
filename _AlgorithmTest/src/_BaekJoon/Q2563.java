package _BaekJoon;

import java.util.Scanner;

public class Q2563 {
	public static void main(String args[]) {
		// 색종이
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] dohwaji = new int[100][100];
		
		int black = 0;
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int a = x; a < x + 10; a++) {
				for(int b = y; b < y + 10; b++) {
					dohwaji[a][b] = 1;
				}
			}
		}
		
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if (dohwaji[i][j] == 1)
					black++;
			}
		}
		
		System.out.println(black);
		
		sc.close();
	}
}
