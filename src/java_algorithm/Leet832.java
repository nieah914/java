package java_algorithm;

public class Leet832 {
	public int[][] flipAndInvertImage(int[][] A) {
		
		flipping(A);
        
        reverse(A);
        
		return A;
    }
	
	public void flipping(int[][] input) {
		int[][] temp = new int[input.length][input[0].length];
		//initial
		for(int i = 0 ; i < temp.length ; i++) {
			for(int j = 0 ; j < temp[i].length ; j++)
				temp[i][j] = 0;
		}
		
		//flipping
		for(int i = 0 ; i < input.length ; i++) {
			for(int j = 0 ; j < input[i].length ; j++) {
				temp[i][j] = input[i][input[i].length-j-1]; 
			}
			for(int k = 0 ; k < input[i].length ; k++) {
				input[i][k] = temp[i][k]; 
			}
		}
		input = temp;
	}
	
	
	
	public void reverse(int[][]input) {
		for(int i = 0; i < input.length ; i++) {
			for(int j = 0 ; j < input[i].length ; j++) {
				if(input[i][j] == 1)
					input[i][j] = 0;
				else 
					input[i][j] = 1;
			}
		}
	}
	
	
	public void printMatrix(int[][]input) {
		System.out.println("--------------");
		
		
		for(int i = 0 ; i < input.length ; i++) {
			for(int j = 0 ; j < input[i].length ; j++) {
				System.out.print(input[i][j]);
			}
			System.out.println();
		}
	}

}
