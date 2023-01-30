import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());	// 듣 사람수 N
		int M = Integer.parseInt(st.nextToken());	// 보 사람수 M
		
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
				
		for(int i = 0; i < M; i++) {
			String str = br.readLine();
			
			if(set.contains(str)) {
				list.add(str);
			}
		}
		
		// 사전순서대로 정렬
		Collections.sort(list);

		bw.write(String.valueOf(list.size())+"\n");	// 듣보잡 수
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i)+"\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}