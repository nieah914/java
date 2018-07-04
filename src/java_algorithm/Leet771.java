package java_algorithm;

public class Leet771 {
	public int numJewelsInStones(String J, String S) {
		int number = 0;
		for(int i = 0 ; i < J.length() ; i++) {
			for(int j = 0 ; j < S.length() ; j++) {
				if(J.charAt(i) == S.charAt(j))
					number += 1;
			}
		}
		return number;
    }
}
