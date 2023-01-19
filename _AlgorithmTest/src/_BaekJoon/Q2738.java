package _BaekJoon;

import java.util.Scanner;

public class Q2738 {	
	public static void main(String args[]) {
		// N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
		// 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
		// 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
		// N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
		// 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
		
		Scanner sc = new Scanner(System.in);
		
		// 행렬의 크기
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// 2차원배열 선언
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] result = new int[N][M];
		
		// 입력부분
		for(int  i = 0; i < N; i++) {
			for(int  j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int  i = 0; i < N; i++) {
			for(int  j = 0; j < M; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		// 덧셈부분
		for(int  i = 0; i < N; i++) {
			for(int  j = 0; j < M; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		
		// 출력부분
		for(int  i = 0; i < N; i++) {
			for(int  j = 0; j < M; j++) {
				System.out.print(result[i][j]+" ");
				if (j == M-1) {
					System.out.println();
				}
			}
		}
		sc.close();
	}
}
