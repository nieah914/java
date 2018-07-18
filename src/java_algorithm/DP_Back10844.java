package java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DP_Back10844 {
	public static int N;
	public static int [][]matrix;
	public static int [][]memorization;
	public static int mod = 1000000000;
	public static int result;
	public static void main(String[] args)  {
		Scanner sn = new Scanner(System.in);
		N = sn.nextInt();
		
		memorization = new int[N+1][10];
		for(int i = 0; i < N+1 ; i++) {
			Arrays.fill(memorization[i], -1);
		}
		result = 0;
		for(int i = 0; i < 10 ; i++) {
			result += Dynamic(N,i); 
		}
		result %= 1000000000;
		System.out.println(result);
	}
	
	public static int Dynamic(int n, int l) {
		
		
		
		if(n == 1 && (1 <= l && l <= 9))
			return 1;
		else if(n == 1 && l == 0)
			return 0;
		else if(n != 1 && ( l  < 0 || l  > 9)) {
			return 0;
		}
		else if(n != 1 && ( 0 <= l && l <= 9)){
			if(memorization[n][l] != -1)
				return memorization[n][l];
			else {
				int temp1 = Dynamic(n-1,l-1)%mod;
				int temp2 = Dynamic(n-1,l-1)%mod;
				return memorization[n][l] = temp1 + temp2;
			}
		}
		else 
			return 0;
		
		
	}
}
