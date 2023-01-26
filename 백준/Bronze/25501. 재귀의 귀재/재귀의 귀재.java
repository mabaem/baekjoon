import java.util.Scanner;

public class Main {	
    // recursion 함수 호출 횟수용 전역변수
	static int count;
	
	public static int recursion(String s, int l, int r){
        // 횟수 증가
		count++;
		
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
	
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int T = sc.nextInt();	// 테스트케이스
    	
    	for(int i = 0; i < T; i++) {
            // 횟수 0으로 초기화
    		count = 0;
    		System.out.println(isPalindrome(sc.next())+" "+count);
    	}
    	
        sc.close();
    }    
}