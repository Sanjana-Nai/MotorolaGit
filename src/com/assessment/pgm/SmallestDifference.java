package com.assessment.pgm;

import java.util.Arrays;

/**
 * 
 * @author Sanjana
 *
 */
public class SmallestDifference {

	public static void main(String[] args)  
	{ 
		int A[] = {1, 3, 15, 11, 2}; 
		int B[] = {23, 127, 235, 19, 8}; 
		int m = A.length; 
		int n = B.length; 
		System.out.println("Smallest Diff--->"+SmallestDiff(A, B, m, n)); 
		System.out.println("--"+A[3]+"--"+B[0]);
	} 
	
	public static int SmallestDiff(int A[], int B[], int m, int n) 
	{  
		Arrays.sort(A); 
		Arrays.sort(B); 
		int a = 0, b = 0; 
		int result = Integer.MAX_VALUE; 
		while (a < m && b < n) 
		{ 
			if (Math.abs(A[a] - B[b]) < result) 
				result = Math.abs(A[a] - B[b]); 
			if (A[a] < B[b]) 
				a++; 
			else
				b++; 
		} 
		return result;  
	} 
}
