package java_algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class DP_Back11052 {
	//the number of bread
	public static int N;	
	//the price of bread per set num
	public static int[] price;
	//the total selling price
	public static int[] sellingPrice;
	/*
	public static void main(String[] args)  {
		Scanner sn = new Scanner(System.in);
		N = sn.nextInt();
		price = new int[N+1];
		sellingPrice = new int[N+1];
		Arrays.fill(sellingPrice,-1);
		for(int i = 1 ; i < N + 1 ; i++) {
			price[i] = sn.nextInt();
		}
		System.out.println(Dynamic(N));
		
		
	}
	*/
	public static int Dynamic(int breadNum) {
		if(breadNum == 1)
			return price[1];
		else 
		{
			if(sellingPrice[breadNum] == -1) {
				int temp = 0;
				for(int i = 1 ; i < breadNum  ; i++) {
					temp = Integer.max(Dynamic(breadNum-i)+Dynamic(i),temp);
				}
				return sellingPrice[breadNum] = Integer.max(temp,price[breadNum]);
			}
			else
				return sellingPrice[breadNum];
		}
	}
}
