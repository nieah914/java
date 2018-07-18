package java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DP_Back2193 {
	public static int N;
	public static long[][] Memorization;
	public static void main(String[] args)  {
		Scanner sn = new Scanner(System.in);
		N = 0;
		N = sn.nextInt();
		Memorization= new long[N+1][2];
		for(int i = 0 ; i < N +1; i++) {
			Arrays.fill(Memorization[i], -1);
		}
		System.out.println(Dynamic(N,1));
	}
	
	public static long Dynamic(int n, int l) {
		if(Memorization[n][l] != -1)
			return Memorization[n][l];
		else {
			if(n == 1) 
				return 1;
			else if(n > 1 && l == 1) {
				return Memorization[n][l] = Dynamic(n-1,0);
			}else if(n > 1 && l == 0) {
				return Memorization[n][l] = Dynamic(n-1,0) + Dynamic(n-1,1);
				
			}
			else {
				return 1;
			}
		}
	}
}
