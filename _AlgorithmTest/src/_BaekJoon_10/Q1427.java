package _BaekJoon_10;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {
	public static void main(String args[]) {
		// 소트인사이드
		
		Scanner sc = new Scanner(System.in);
		
		char[] charArray = sc.nextLine().toCharArray();
		
		Arrays.sort(charArray); 
		
		for(int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		
		sc.close();
	}
}
