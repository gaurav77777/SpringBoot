package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;



import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingPracticeApplication {
	
	 public static int minSwaps(int[] arr, int N) 
	    { 
	  
	        int ans = 0; 
	        int[] temp = Arrays.copyOfRange(arr, 0, N); 
	        System.out.println(temp);
	  
	        // Hashmap which stores the 
	        // indexes of the input array 
	        HashMap<Integer, Integer> h 
	            = new HashMap<Integer, Integer>(); 
	  
	        Arrays.sort(temp); 
	        System.out.println("After Sort"+temp);
	        for (int i = 0; i < N; i++) { 
	            h.put(arr[i], i); 
	        } 
	        for (int i = 0; i < N; i++) { 
	  
	            // This is checking whether 
	            // the current element is 
	            // at the right place or not 
	            if (arr[i] != temp[i]) { 
	                ans++; 
	                int init = arr[i]; 
	  
	                // If not, swap this element 
	                // with the index of the 
	                // element which should come here 
	                   swap(arr, i, h.get(temp[i])); 
	  
	                // Update the indexes in 
	                // the hashmap accordingly 
	                  h.put(init, h.get(temp[i])); 
	                  h.put(temp[i], i); 
	            } 
	        } 
	        return ans; 
	    }
	 
	 public static void swap(int[] arr, int i, int j) 
	    { 
	        int temp = arr[i]; 
	        arr[i] = arr[j]; 
	        arr[j] = temp; 
	    } 
	

	public static void main(String[] args) {
		//SpringApplication.run(CodingPracticeApplication.class, args);
		//Stream<Integer> stream = null ;
		
		
		//----------------- Stream API Starts------------------------
		/*
		 * Stream<String> streamEmpty = Stream.empty(); List<Integer> list = new
		 * ArrayList<>(); list.add(3); list.add(1); list.add(2);
		 * System.out.println(list);
		 */
		
		//list.stream().map(x->x*x).collect(Collectors.toList());
		//List square = list.stream().map(x->x*x).collect(Collectors.toList());
		//stream = (Stream<Integer>) list.stream().map(x->x*x).collect(Collectors.toList());
		//System.out.println("square"+square);
		//System.out.println("stream"+stream);
		
		//List<String> names = Arrays.asList("Reflection","Collection","Stream");
		//List<String> result =names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		//Stream<String> result =(Stream<String>) names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		/*
		 * List result =
		 * names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		 * List result1 = names.stream().sorted().collect(Collectors.toList());
		 * System.out.println("result"+result); System.out.println("result1"+result1);
		 * System.out.println("streamEmpty"+streamEmpty); Collection<String> collection
		 * = Arrays.asList("a", "b", "c"); Stream<String> streamOfCollection =
		 * collection.stream();
		 * System.out.println("streamOfCollection"+streamOfCollection.findAny());
		 */
		
		//----------------- Stream API Ends------------------------
		
		
		//-----------------Compare two list Starts------------------
		
		
		/*
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
		ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "e", "f"));
		
		List<String> listOfAdditionalItems = listOne.stream()
			    .filter(item -> !listTwo.contains(item))
			    .toList();
		List<String> listOfAdditionalItemsSame = listOne.stream()
			    .filter(item -> listTwo.contains(item))
			    .toList();
		System.out.println("listOfAdditionalItems:"+listOfAdditionalItems);
		System.out.println("listOfAdditionalItemsSame:"+listOfAdditionalItemsSame);
		
		List<String> listOfSameItems = new ArrayList<>(listOne);
		listOne.removeAll(listOfAdditionalItems);
		System.out.println("listOne:"+listOne);
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars.length);

	    
	   

	    */
		
		
		//-----------------Compare two list Ends------------------
		
		
		/*
		 * System.out.println("Unsorted ArrayList: " + list); Collections.sort(list);
		 * System.out.println("Sorted ArrayList " + "in ascending order : " + list);
		 * Collections.sort(list, Collections.reverseOrder());
		 * System.out.println("Sorted ArrayList " + "in Descending order : " + list);
		 */
		
		//---------------------Swap for Sort Starts----------------------
		
		   
		 int[] a 
         = { 101, 758, 315, 730, 472, 619, 460, 479 }; 
         int n = a.length; 
      
         System.out.println(minSwaps(a, n));
          //System.out.println(new GfG().minSwaps(a, n)); 
		
		//---------------------Swap for Sort Ends----------------------
	}

}
