package _BaekJoon;

import java.util.Scanner;

public class Q2566 {
	public static void main(String args[]) {
		// 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
		// 첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.
		// 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 
		// 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int[][] number = new int[9][9];
		
		// 입력부분
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				number[i][j] = sc.nextInt();
			}
		}
		
		int max = number[0][0];	// 최대값
		int x = 0, y = 0;	// 인자값
		
		// 최대값, 인자값 저장부분
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				
				if (max <= number[i][j]) {
					max = number[i][j];
					x = i+1;
					y = j+1;
				}
				
			}
		}
		
		// 출력부분
		System.out.println(max);
		System.out.println(x+" "+y);
		
		sc.close();
	}
}
