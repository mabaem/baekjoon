package _BaekJoon_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q10814 {
	public static void main(String args[]) {
		// 나이순 정렬
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 회원수

		String[][] array = new String[n][2];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = sc.next();
			}
		}
		
		// 나이순(오름차순), 이름(입력순)
		Arrays.sort(array, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
			
		});
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i][0]+" "+array[i][1]);
	
		}
	
		
		sc.close();
	}
}
