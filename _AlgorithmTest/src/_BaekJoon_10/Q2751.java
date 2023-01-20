package _BaekJoon_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {
	public static void main(String args[]) throws IOException {
		// 오름차순 정렬 - Collections.sort
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> array = new ArrayList<>();
		
		// 입력 부분
		for(int i = 0; i < N; i++) {
			array.add(Integer.parseInt(br.readLine()));
		}
		
		// 정렬 부분
		Collections.sort(array);
		
		// 출력 부분
		for(int value : array) {
			sb.append(value).append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
