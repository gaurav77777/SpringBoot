package com.example.demo.coding;

import java.io.*;
import java.util.*;

public class Anargram {
	
	/*
	 

	Two strings,  and , are called anagrams if they 
	contain all the same characters in the same frequencies.
	For this challenge, the test is not case-sensitive. 
	For example, the anagrams of CAT are CAT, ACT, tac,
	TCA, aTC, and CtA.
	
	*/
	
	//approach 1
	
	
	static boolean isAnagram(String firstWord, String secondWord) {
	     char[] word1 = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     return Arrays.equals(word1, word2);
	    }
	
	
	
	//approach 2
	
	/*
	
	 private static int[] frequency = new int[26];

	    static boolean isAnagram(String a, String b) {
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        
	        System.out.println("frequency.length"+frequency.length); 
	        System.out.println("frequency.length"+(int)a.charAt(1)); 
	        
	        for(int i=0;i<frequency.length;i++)//length is the property of array  
	        	System.out.println("frequency[i]"+frequency[i]);  
	        
	        for (char c : a.toCharArray()) {
	            frequency[(int) c - 97]++;
	        }
	        for (char c : b.toCharArray()) {
	            frequency[(int) c - 97]--;
	        }
	        
	        boolean anagrams = true;
	        for (int i : frequency) {
	            if (i != 0) {
	                anagrams = false;
	                break;
	            }
	        }
	        return anagrams;
	    }
	    
	    */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)
        	{
        	System.out.println("Anagrams");
        	}
        else 
        	{
        	System.out.println("Not Anagrams");
        	}


	}

}
