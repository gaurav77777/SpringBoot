package com.example.demo.coding;
import java.util.*;

/*Print the maximum number of unique integers among all possible contiguous subarrays of size

Sample Input

6 3
5 3 5 2 3 2


Sample Output

3
*/


public class Java_dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
               
            deque.add(num);
            set.add(num);
           
            if(deque.size() == m){
                int first = deque.removeFirst();
                max = Math.max(set.size(), max);
                if(!deque.contains(first))
                {
                	set.remove(first);
                }
            }
              
        }
         System.out.println(max);
	}

}
