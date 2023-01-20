package _BaekJoon_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1181 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] array = new String[N];
		
		sc.nextLine();
		
		// 입력
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextLine();
		}
		
		// 단어 정렬
		Arrays.sort(array, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				
				else {
					return o1.length() - o2.length();
				}
			}
			
		});
		
		
		// 출력
		StringBuffer sb = new StringBuffer();
		
		sb.append(array[0]).append("\n");
		
		for (int i = 1; i < N; i++) {
			// 중복단어 제거
			if (!array[i].equals(array[i-1])) {
				sb.append(array[i]).append("\n");				
			}			
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
