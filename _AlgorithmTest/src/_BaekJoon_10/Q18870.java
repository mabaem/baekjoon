package _BaekJoon_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q18870 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array = new int[n];
		int[] sortedArray = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = sortedArray[i] = sc.nextInt();
		}
		
		Arrays.sort(sortedArray);
		
		Map<Integer, Integer> getIndexToSortedArray = new HashMap<Integer,Integer>();
		
		int index = 0;
		
		for(int key : sortedArray) {
			if(!getIndexToSortedArray.containsKey(key)) {
				getIndexToSortedArray.put(key,index);
				index ++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int key : array) {
			sb.append(getIndexToSortedArray.get(key)).append(" ");
		}
		
		System.out.print(sb);
		
		sc.close();
	}
}
