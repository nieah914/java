package java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DP_Back9465 {
	public static int caseNum;
	public static int N;
	public static int [][]  sticker;
	public static int [][]  Memorization;
	public static int [] printN;
	public static void main(String[] args)  {
		Scanner sn = new Scanner(System.in);
		caseNum = 0;
		caseNum = sn.nextInt();
		printN = new int[caseNum];
		Arrays.fill(printN, 0);
		for(int i = 0 ; i < caseNum ; i++) {
			N = 0;
			N = sn.nextInt();
			Memorization= new int[2][N];
			sticker= new int[2][N];
			for(int j = 0 ; j < 2; j++) {
				Arrays.fill(Memorization[j], -1);
			}
			for(int j = 0 ; j < 2 ; j++) {
				for(int k = 0 ; k < N ; k++) {
					sticker[j][k] = sn.nextInt();
				}
			}
			printN[i] = Math.max(Dynamic(N-1,1),Dynamic(N-1,0));
		}
		for(int i = 0 ; i < caseNum ; i++) {
			System.out.println(printN[i]);
		}
		//printMatrix();		
	}
	
	public static int Dynamic(int n, int l) {

		if(n < 0) {
			return 0;
		}
		else {
			if(Memorization[l][n] != -1)
				return Memorization[l][n];
			if(l == 0 && n >= 1) {
				return Memorization[l][n] = Math.max(Dynamic(n-1,1),Dynamic(n-2,1)) + sticker[l][n];
			}
			else if( l == 1 && n >= 1) {
				return Memorization[l][n] =Math.max(Dynamic(n-1,0), Dynamic(n-2,0)) + sticker[l][n];
			}
			else if (n == 0) {
				return sticker[l][n];
			}
	
			else 
				return 0;
		}
		
	}
	
	public static void printMatrix() {
		for(int i = 0 ; i < 2 ; i++) {
			for (int j = 0 ; j < N ; j++) {
				System.out.print(sticker[i][j] + " ");
			}
			System.out.println();
		}
	}
}
