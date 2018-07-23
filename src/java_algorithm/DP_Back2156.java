package java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DP_Back2156 {
	public static int N; //인풋 갯수
	public static int[] Price;
	public static int[][] eaten;
	public static void main(String[] args)  {
		Scanner sn = new Scanner(System.in);
		N = 0;
		N = sn.nextInt();
		Price = new int[N+1];
		eaten = new int[N+1][3];
		for(int i = 1 ; i <= N ; i++) {
			Price[i] = sn.nextInt();
		}
		for(int i = 0 ; i <= N ; i++)
			Arrays.fill(eaten[i],-1);
		
		
		//printAll();
		System.out.println(Math.max(Dynamic(N,1), Math.max(Dynamic(N,0), Dynamic(N,2))));
	}
	public static int Dynamic(int n, int l) {
		//기저
		if(n == 3 && l == 0)
			return  Price[1] + Price[2]; 
		else if (n == 3 && l == 2)
			return  Price[2] + Price[3];
		else if (n == 3 && l ==1) 
			return  Price[1] + Price[3];
		else if (n == 2 && l == 1)
			return  Price[2];
		else if (n == 2 && l == 2)
			return  Price[1] + Price[2];
		else if (n == 2 && l == 0)
			return  Price[1];
		else if (n == 1 && l == 1)
			return  Price[1];
		//메모이제이션
		if(eaten[n][l] != -1)
			return eaten[n][l];

		//로직
		if(n > 3 && l == 0)
			return eaten[n][l] = Math.max(Dynamic(n-1,0),Math.max(Dynamic(n-1,1), Dynamic(n-1,2)));
		else if (n > 3 && l == 1) 
			return eaten[n][l] = Dynamic(n-1,0) + Price[n];
		else if (n > 3 && l == 2) 
			return eaten[n][l] = Dynamic(n-2,0) + Price[n] + Price[n-1];
		else
			return 0;

				
	}
	
	public static void printAll() {
		for(int i = 1 ; i <= N ; i++) {
			System.out.print(Price[i] + " ");
		}
	}
	
}
