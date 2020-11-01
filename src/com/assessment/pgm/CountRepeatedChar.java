package com.assessment.pgm;
/**
 * 
 * @author Sanjana
 *
 */
public class CountRepeatedChar {

	public static void main(String[] args) {
		
		String str=countRepeatChars("aabcccccaaa");
		String str1=countRepeatChars("abc");
		
		System.out.println(str);
		System.out.println(str1);
		
	}
	
	public static String countRepeatChars(String str){
	    int initialLength = str.length();
	    char[] chars = str.toCharArray();
	    int occurances = 0;
	    String compressedString = "";
	    char currentChar = chars[0];
	    for(int i = 0; i < initialLength; i++){
	        char c  = chars[i];
	        if(currentChar == c && i + 1 <= initialLength){
	            occurances++;
	        }

	        else if (currentChar != c || i + 1  > initialLength){

	            compressedString += currentChar + String.valueOf(occurances);
	            currentChar = chars[i];
	            occurances = 1;
	        }

	        if(i + 1 >=  initialLength){
	            compressedString += currentChar + String.valueOf(occurances);

	        }
	    }
	    if(compressedString.length() < initialLength){
	         return compressedString;
	    }
	    return str;
	}
}
