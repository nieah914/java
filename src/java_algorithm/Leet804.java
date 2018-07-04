package java_algorithm;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Leet804 {
	private String[] dotList = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	private String container = new String();
	private Vector<String> patten = new Vector<String>();
	
	
    public int uniqueMorseRepresentations(String[] words) {
    	int criteria = 'a';
    	
    	for(int i = 0 ; i < words.length ; i++) {
    		boolean isdiff = true;
    		for(int j = 0 ; j < words[i].length() ; j++) {
    			//System.out.println(words[i].charAt(j)-criteria);
    			container += dotList[words[i].charAt(j)-criteria];
    		}
    		if(patten.size() == 0)
    			patten.add(container);
    		else {
    			for(int k = 0 ; k < patten.size() ; k++) {
    				if(patten.elementAt(k).equals(container))
    					isdiff = false;
    			}

        		if(isdiff == true ) {
        			patten.add(container);

        		}
    		}
			container = new String();
    		
    	}
    	for(int i = 0 ; i < patten.size() ; i++) {
    		System.out.println(patten.get(i));
    	}
    	return patten.size(); 
    }
}
