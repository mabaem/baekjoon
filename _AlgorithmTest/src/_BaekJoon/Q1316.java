package _BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1316 {
	/*
	 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
	 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
	 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
	 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
	 * 
	 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 단어의 개수 N이 들어온다. 
	 * N은 100보다 작거나 같은 자연수이다. 
	 * 둘째 줄부터 N개의 줄에 단어가 들어온다. 
	 * 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
	 * 
	 * 첫째 줄에 그룹 단어의 개수를 출력한다.
	 */
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	
		String word = br.readLine();
		
		System.out.println(countWord(word));
	}
	
	public static int countWord(String str) { 
		int count = 0;
		
		/*
		 * 모두 만족할 때 count++
		 * 1. 입력받은 단어의 ch가 모두 다른 알파벳일 경우 : true
		 * ex) abc, a
		 * 2. 입력받은 단어의 ch가 바로 다음에 나올경우 : true
		 * ex) aa, aabbcc, abbc
		 * 3.입력받은 단어의 ch가 바로다음이 아닌 나중에 나오는 경우 : false
		 * ex) aba, ababab, abbca
		 */
		
		boolean[] bCheck = new boolean[str.length()];
		Arrays.fill(bCheck, false);
		
		for (int i=0; i<str.length()-1; i++) {
			char ch = str.charAt(i);
			
			if (ch != str.charAt(i+1)) {
				bCheck[i] = true;
			} else if (ch == str.charAt(i+1)) {
				bCheck[i] = true;
			}
			
		}
		
		return count;
	}
	
}
