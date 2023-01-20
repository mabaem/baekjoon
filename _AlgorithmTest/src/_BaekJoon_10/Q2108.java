package _BaekJoon_10;

import java.util.Arrays;
import java.util.Scanner;

public class Q2108 {
	public static void main(String args[]) {
		// 통계학
		// 산술평균, 중앙값, 최빈값, 범위
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 수의 개수
		int[] array = new int[n];
		
		// 입력
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		
		/* 산술평균 */
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += array[i];
		}
		
		int avg = sum / n;
		
		// |나머지| 가 5보다 크거나 같으면 반올림
		if (Math.abs(sum % n) >= 5) {
			// 평균이 양수인 경우
			if (avg >= 0) avg += 1;
			
			// 평균이 음수인 경우
			else avg -= 1;
			
			System.out.println(Math.abs(sum % n));
		}
		System.out.println(avg);
		
		
		/* 중앙값 */
		int center;
		
		// 오름차순 정렬
		Arrays.sort(array);
		
		center = array[n / 2];
		
		System.out.println(center);
		
		
		/* 최빈값 */
		int count = 0;
		int[] countIndex = new int[n + 1];
		
		for(int i = 0; i < n; i++) {
			countIndex[array[i]]++;
		}
		
		for(int i = 0; i < countIndex.length; i++) {

			if () {
				
			}
			count = i;
		}
		
		
		System.out.println(count);
		
		/* 범위 */
		int min = array[0];
		int max = array[0];
		
		for(int i = 0; i < n - 1; i++) {
			if (min > array[i + 1]) {
				min = array[i + 1];
			}
			
			if (max < array[i + 1]) {
				max = array[i + 1];
			}
		}
		
		int length = max - min;
		
		System.out.println(length);
		
		
		sc.close();
	}
}
