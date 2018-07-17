package java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DP_Back11057 {
	public static int N;
	public static long result;
	public static long mod = 10007;
	public static long[][] map;
	public static void main(String[] args)  {
		Scanner sn = new Scanner(System.in);
		result = 0;
		N = sn.nextInt();
		map = new long [N+1][10];
		for(int i = 0; i < N+1 ; i++) {
			Arrays.fill(map[i], -1);
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			result += Dynamic(N,i);
		}
		System.out.println(result%10007);
	}
	public static long Dynamic(int n, int l) {
		long temp = 0;
		if( n == 1 && ( 0 <= l && l <= 9) )
			return 1;
		else if ( n > 1 && (  0 <= l && l <= 9) ) {
			if(map[n][l] != -1)
				return map[n][l];
			else {
				for(int i = l ; i <= 9 ; i++)
					temp += (Dynamic(n-1,i)% mod); 
				return  map[n][l] = temp;
			}
		}
		else
			return 0;
		
		
		
	}
}
