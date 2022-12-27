package _BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
	
	/*
	 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
	 * 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
	 * 
	 * 크로아티아  변경
	 *  č 		c= 
	 *  ć 		c- 
	 *  dž 		dz= 
	 *  đ 		d- 
	 *  lj 		lj 
	 *  nj 		nj 
	 *  š 		s= 
	 *  ž 		z= 
	 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
	 * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져있는지 출력한다.
	 * 
	 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
	 * lj와 nj도 마찬가지이다. 
	 * 위 목록에 없는 알파벳은 한글자씩 센다.
	 * 
	 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
	 * 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
	 * 
	 * 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	 */
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(alphabetCount(str));
	}
	
	public static int alphabetCount(String str) {
		int count = 0;
		int len = str.length();
		
		for (int i=0; i<len; i++) {
			char ch = str.charAt(i);
			
			// c=  c-
			if ((ch == 'c') && (i < len-1)) {
				if ((str.charAt(i+1) == '=') || (str.charAt(i+1) == '-')) {
					i++;
				}
			}
			// d-  dz=
			else if ((ch == 'd') && (i < len-1)) {
				if (str.charAt(i+1) == '-') {
					i++;
				}
				else if ((str.charAt(i+1) == 'z') && (i < len-2)) {
					if (str.charAt(i+2) == '=') {
						i += 2;
					}
				}
			}
			// lj  nj
			else if (((ch == 'l') || (ch == 'n')) && (i < len-1)) {
				if (str.charAt(i+1) == 'j') {
					i++;
				}
			}
			// s=  z=
			else if (((ch == 's') || (ch == 'z')) && (i < len-1)) {
				if (str.charAt(i+1) == '=') {
					i++;
				}
			}
			
			//count 증가
			count++;
		}
		
		return count;
	}
}
