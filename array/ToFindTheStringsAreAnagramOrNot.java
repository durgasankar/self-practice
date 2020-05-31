package array;

import java.util.*;

public class ToFindTheStringsAreAnagramOrNot {
	public static void main(String[] args) {
		
		String str1 = "Mother in law";
		String str2 = "Hitler woman";
		
		//after removing space with nothing and converted to lowercase
		String s1 = str1.replaceAll("\\s", "").toLowerCase();  
        String s2 = str2.replaceAll("\\s", "").toLowerCase(); 
        
        if(s1.length() == s2.length()) {
        	
        	/*char[] c1 = s1.toCharArray();
        	char[] c2 = s2.toCharArray();
        	
        	for(int i = 0; i <= c1.length; i++) {
        		for(int j = 0; i <= c2.length; j++) {
        			if(c1[i] == c2[j]) {
        				
        			}	
        		}
        	}*/
        	System.out.println("it is an anagram");
        	
        	
        	
        }
        else {
        	System.out.println("Not an anagram");
        }
        
        //System.out.println(s1);
	}

}
