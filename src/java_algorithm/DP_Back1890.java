package java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DP_Back1890 {
	
	public static int N = 0;
	public static int[][] matrix ;
	public static long[][] isStoped ;
	
	/*
	public static void main(String[] args)  {
		Scanner sn = new Scanner(System.in);
		N = sn.nextInt();
		matrix = new int[N][N];
		isStoped = new long[N][N];
		
		for(int i = 0 ; i < N ; i++ ) {
			for( int j = 0 ; j < N ; j++) {
				matrix[i][j] = sn.nextInt();
			}
			Arrays.fill(isStoped[i], -1); 
		}
		//print_matrix();
		System.out.print(Dynamic(0,0));
		
		
	}
	
	*/
	public static void print_matrix() {
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j ++) {
				System.out.print(isStoped[i][j]);
			}
			System.out.println();
		}
	}
	
	public static long Dynamic(int a, int b) {
		
		
		
		if( a == N-1  && b == N-1 )
			return 1;
		else if(a > N -1 && b < N )
			return 0;
		else if(b > N -1 && a < N ) 
			return 0;
		else if( (a == N-1  && b == N-1) == false  && matrix[a][b] == 0)
			return 0;
		else  {
			
			int jumpSize = matrix[a][b];

			if(isStoped[a][b] != -1) 
				return isStoped[a][b];
			else
				return isStoped[a][b] = Dynamic(a + jumpSize, b) + Dynamic(a, b + jumpSize);
		}
		
	}
		
}
