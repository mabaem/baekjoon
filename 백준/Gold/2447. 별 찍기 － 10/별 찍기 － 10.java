import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[][] array;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		array = new char[N][N];
		
		drawStars(0, 0, N, false);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(array[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.print(sb);
		
		br.close();
	}
	
	static void drawStars(int row, int column, int n, boolean blank) {
		
		if (blank) {
			for(int i = row; i < row + n; i++) {
				for(int j = column; j < column + n; j++) {
					array[i][j] = ' ';				
				}				
			}
			return;
		}
		
		if (n == 1) {
			array[row][column] = '*';
			return;
		}
		
		int size = n / 3;
		int count = 0;
		
		for (int i = row; i < row + n; i += size) {
			for (int j = column; j < column + n; j += size) {
				count++;
				
				if (count == 5) { 
					drawStars(i, j, size, true);
				} else {
					drawStars(i, j, size, false);
				}
			}
		}
		
	}
}
