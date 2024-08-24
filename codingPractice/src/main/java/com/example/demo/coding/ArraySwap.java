package com.example.demo.coding;

import java.io.*; 
import java.util.*; 


// Find minimum number of swaps required to sort array


/*
 * Steps
 * 
 * 1. Create indexOf method to find index of element in an array
 * 2. Create swap method to swap elements in an array
 * 3. Create minSwaps method which will return number of swaps required
 *    3.1 create copy of given array with name temp, sort temp using Arrays.Sort Method.
 *    3.2 inside a for loop compare ith element of both original array and temp array if element
 *    does not match swap the elements of original array by calling swap method also increment the
 *    result counter.
 *    3.3 swap(arr, i, indexOf(arr, temp[i]));
 *    3.4 return result counter at the end of loop
 * 
 * 
 * 
 * */


public class ArraySwap {
	
	// Return the minimum number 
    // of swaps required to sort the array 
    public int minSwaps(int[] arr, int N) 
    { 
        int ans = 0; 
        int[] temp = Arrays.copyOfRange(arr, 0, N); 
        Arrays.sort(temp); 
        for(int i=0;i<temp.length;i++)//length is the property of array  
        	System.out.println("temp[i]"+temp[i]); 
        for (int i = 0; i < N; i++) { 
  
            // This is checking whether 
            // the current element is 
            // at the right place or not 
            if (arr[i] != temp[i]) { 
                ans++; 
  
                // Swap the current element 
                // with the right index 
                // so that arr[0] to arr[i] is sorted 
                System.out.println("Before swap"+arr[i]); 
                swap(arr, i, indexOf(arr, temp[i])); 
                System.out.println("After swap"+arr[i]); 
            } 
        } 
        return ans; 
    } 
    
    public void swap(int[] arr, int i, int j) 
    { 
    	System.out.println("Inside swap"); 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
    
    public int indexOf(int[] arr, int ele) 
    { 
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == ele) { 
                return i; 
            } 
        } 
        return -1; 
    } 
    
    
    public static void main(String[] args) throws Exception 
    { 
        //int[] a = { 101, 758, 315, 730, 472, 619, 460, 479 }; 
    	int[] a = {7,5,4,3,2,1,8};
    	
        int n = a.length; 
        for(int i=0;i<a.length;i++)//length is the property of array  
        	System.out.println("a[i]"+a[i]);  
        
        System.out.println(n); 
        // Output will be 5 
        //System.out.println(new GfG().minSwaps(a, n)); 
        ArraySwap test = new ArraySwap();
		
		System.out.println(test.minSwaps(a, n));
		for(int i=0;i<a.length;i++)//length is the property of array  
        	System.out.println("a[i]"+a[i]); 
    } 

}
