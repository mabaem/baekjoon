import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());	// 도감에 있는 포켓몬 수
		int M = Integer.parseInt(st.nextToken());	// 문제 개수
		
		Map<Integer, String> dogamIntKey = new HashMap<>();
		Map<String, Integer> dogamStringKey = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			
			dogamIntKey.put(i+1, str);
			dogamStringKey.put(str, i+1);
		}
		
		for(int i = 0; i < M; i++) {
			String test = br.readLine();
			
			// 입력받은 문제가 숫자인 경우
			if (isNumber(test)) {
				System.out.print(dogamIntKey.get(Integer.parseInt(test)));
			}
			
			// 입력받은 문제가 문자열인 경우
			else {
				System.out.print(dogamStringKey.get(test));
			}
			
			System.out.println();
		}		

		br.close();
	}
	
	public static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return false;
		}	
	}
}