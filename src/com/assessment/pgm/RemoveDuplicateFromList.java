package com.assessment.pgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Sanjana
 *
 */
public class RemoveDuplicateFromList {

	public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 
        System.out.println("ArrayList with duplicates: " + al); 
        
        ArrayList<Integer> List = removeDuplicates(al); 
        System.out.println("After removing duplicates "+ List); 
  
        ArrayList<String> al1 = new ArrayList<>(Arrays.asList("G","e","e","k","s")); 
        System.out.println("ArrayList with duplicates: " + al1); 
        
        ArrayList<String> List1 = removeDuplicates(al1); 
        System.out.println("After removing duplicates "+ List1); 
	}
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> lt) 
    { 
        ArrayList<T> l = new ArrayList<T>(); 
        for (T element : lt) 
        { 
            if (!l.contains(element)) 
            { 
                l.add(element); 
            } 
        } 
        return l; 
    } 
}
