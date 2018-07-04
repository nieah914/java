package java_algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leet001 {
	
    public int[] twoSum(int[] nums, int target) {
    	int goal = 0;
    	int[] anwser = new int[2];
    	for(int i = 0 ; i < nums.length ; i++) { 
    		for(int j = i + 1 ; j < nums.length; j++ ) {
    			goal = nums[i] + nums[j];
    			if(goal == target) {
    				anwser[0] = i;
    				anwser[1] = j;
    			}		
    		}
    	}
		return anwser;
    }
}