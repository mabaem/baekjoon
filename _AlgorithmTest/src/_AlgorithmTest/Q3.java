package _AlgorithmTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q3 {

	/*
	 * Q3. n 명의 사람 이름 중에서 같은 이름(동명이인)을 찾아 집합으로 만들어 돌려주는 알고리즘을 만들어보세요. 
	 * 사람의 이름은 무작위로 콘솔을 통해 입력받습니다.
	 * 
	 */
	public static void main(String args[]) {				
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.print("사람 수 입력 : ");
		int n = sc.nextInt();
		
		System.out.print("이름 "+n+"명 입력 : ");
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int count = 0;
			
			if (map.containsKey(name)) {
				map.put(name, count+1);
			}
		}
		
		List<String> result = new ArrayList<String>();
		
		for (String name : map.keySet()) {
			if (map.get(name) > 1)
				result.add(name);
			
		}
		
		
		for (int j=0; j<result.size(); j++)
			System.out.println(result.get(j));
		
		
		sc.close();		
	}
	
//	public static void main(String args[]) {				
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("사람 수 입력 : ");
//		int n = sc.nextInt();
//		
//		String[] names = new String[n];
//		System.out.print("이름 "+n+"명 입력 : ");
//		for (int i = 0; i < n; i++) {
//			names[i] = sc.next();
//		}
//		System.out.println("----------------");
//		
//		List<String> result = new ArrayList<String>();
//		result = sameName(names);
//		
//		System.out.print("동명이인 집합 : {");
//		int j = 0;
//		while (j < result.size()){
//			System.out.print(result.get(j));
//			j++;
//			System.out.print(result.get(j));		
//		}
//		System.out.println("}");
//		sc.close();		
//	}
	
	
//	public static List<String> sameName(String[] names) {
//		List<String> result = new ArrayList<String>();
//		
//		for (int i = 0; i < (names.length-1); i++) {
//			for (int j = (i+1); j < names.length; j++) {
//				if (names[i].equals(names[j])) {
//					result.add(i, names[i]);
//				}
//			}			
//		}
//		
//		return result;
//	}
	
}
