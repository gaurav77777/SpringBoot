package com.example.demo.coding;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.List;

/*In this problem you have to print the largest sum among all the hourglasses in the array.


The Java code you provided appears to be a solution to a problem involving a 6x6 2D array (matrix) and the
task of finding the highest sum of hourglass shapes within that array.
Each hourglass shape is a subset of the 2D array, and the sum of its elements is calculated.*/



public class Java2DArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int higher = getHigher(arr);

        System.out.println(higher);

	}
	
	private static int getHigher(List<List<Integer>> arr) {
        int sum = 0;
        int higher = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                sum = (arr.get(i).get(j) + 
                        arr.get(i).get(j+1) + 
                        arr.get(i).get(j+2)) + 
                        arr.get(i+1).get(j+1) + 
                        (arr.get(i+2).get(j) + 
                        arr.get(i+2).get(j+1) + 
                        arr.get(i+2).get(j+2));
                
                if (sum > higher) {
                    higher = sum;
                }
            }
        }

        return higher;
    }

}
