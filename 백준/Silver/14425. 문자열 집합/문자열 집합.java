import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> S = new HashMap<>();
		int count = 0;
				
		for(int i = 0; i < N; i++) {
			S.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < M; i++) {
			String str = br.readLine();
			
			if (S.get(str) != null) {
				count++;
			}
		}
		bw.write(count + "\n");
        
		br.close();
		bw.flush();
		bw.close();
	}
}