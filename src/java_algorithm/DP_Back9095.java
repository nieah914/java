package java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DP_Back9095 {
	public static int[]memoizatin;
	public static int[]outputlist;
	public static int N;
	public static int CASE;
	public static void main(String[] args)  {
		Scanner sn = new Scanner(System.in);
		
		N = sn.nextInt();
		outputlist = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			CASE = sn.nextInt();
			memoizatin = new int[CASE+1];
			Arrays.fill(memoizatin, -1); 
			outputlist[i] = Dynamic(CASE);
		}
		
		for(int i = 0 ; i < N ; i++) {
			System.out.println(outputlist[i]);
		}
		//print_matrix();
		
		
		
	}
	

	public static int Dynamic(int n) {
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			return 2;
		}
		else if (n == 3) {
			return 4;
		}
		else {
			if(memoizatin[n] != -1)
				return memoizatin[n];
			else {
				return memoizatin[n] = Dynamic(n-1) + Dynamic(n-2) + Dynamic(n-3);
			}
		}
	}
	
}


