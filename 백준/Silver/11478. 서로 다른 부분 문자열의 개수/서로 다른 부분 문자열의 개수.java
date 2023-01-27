import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String S = br.readLine();
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < S.length(); i++) {
			for(int j = i; j < S.length(); j++) {
				if (!map.containsKey(S)) {
					map.put(S.substring(i, j+1), 1);
				}
				else {
					map.put(S.substring(i, j+1), map.get(S.substring(i, j+1)+1));
				}
			}
		}
		
		System.out.println(map.entrySet().size());
        
		br.close();
	}
}