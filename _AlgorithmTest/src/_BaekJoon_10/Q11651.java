package _BaekJoon_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q11651 {
	public static void main(String args[]) {
		// 좌표 정렬하기2
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[][] array = new Integer[n][2];	
		
		// 입력
		for(int i = 0; i < n; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}
		
		// 정렬
		Arrays.sort(array, new Comparator<Integer[]>() { 

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				// TODO Auto-generated method stub
				if (o1[1].equals(o2[1])) {
					return o1[0] - o2[0];
				}
				else {
					return o1[1] - o2[1];
				}
			}
		
		});  
		
		// 출력
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(array[i][0]+" "+array[i][1]).append("\n");
		}
		
		System.out.println(sb);
	
		sc.close();
	}
}
