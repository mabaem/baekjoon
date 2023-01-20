package _BaekJoon_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
/*
상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

출력
상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
 */
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	//총 무게 입력
		
		System.out.println(sugar(N));
	}
	public static int sugar(int n) {
		int count = 0;	//설탕 봉투 개수
		
		//입력받은 수가 5보다 크거나 같으면
		if (n >= 5) {
			count = n / 5;
			
			//나머지가 있으면
			if ((n % 5) != 0) {
				
				//그 나머지를 3으로 나눴을 때 나머지가 있으면 -1 리턴
				if (((n % 5) % 3) != 0) {
					return -1;
				}
				//그 나머지가 3의 약수이면
				else {
					count += (n % 5) / 3;					
				}
			}
			
		}
		//입력받은 수가 5보다 작으면
		else {
			count = n / 3;
			
			//3으로 나눴을 때 나머지가 있으면 -1 리턴
			if((n % 3) != 0) {
				return -1;
			}
		}
		
		return count;
	}
}
