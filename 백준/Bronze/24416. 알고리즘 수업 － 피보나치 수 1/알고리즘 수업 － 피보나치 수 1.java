import java.util.Scanner;

public class Main {	
	static int count_fib = 0;
	static int count_fibonacci = 0;
	
	public static int fib(int n) {
	    if (n == 1 || n == 2) {
	    	count_fib++;
	    	return 1;
	    }
	    else {
	    	return (fib(n - 1) + fib(n - 2));
	    }
	}

	public static int fibonacci(int n) {
	    int[] f = new int[n + 1];
	    f[1] = f[2] = 1;
	    for (int i = 3; i <= n; i++) {
	    	count_fibonacci++;
	    	f[i] = f[i - 1] + f[i - 2];
	    }
	    return f[n];
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();	
		sc.close();
        
		fib(n);
		fibonacci(n);
		System.out.println(count_fib + " " + count_fibonacci);
	}
}