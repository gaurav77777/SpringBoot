package com.example.demo.coding;

import java.util.Scanner;

/*
 * 
 * A string containing only parentheses is balanced if the following is true:
1. if it is an empty string 
2. if A and B are correct, AB is correct, 
3. if A is correct, (A) and {A} and [A] are also correct.



Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

*/



public class Java_Stack {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            char[] the_input = input.toCharArray();
            int counter = 0;

			        for(int i = 0; i<the_input.length;i++)
			        {
			            if(the_input[i] == '{' || the_input[i] == '(' || the_input[i] == '[')
			            {
			                counter ++;
			            }
			
			            if(the_input[i] == '}' || the_input[i] == ')' || the_input[i] == ']')
			            {
			                counter --;
			            }
			
			            if(counter < 0)
			            {
			                System.out.println("false");
			                break;
			            }
			
			        }
			        if(counter > 0)
			        {
			            System.out.println("false");
			        }
			        if(counter == 0)
			        {
			            System.out.println("true");
			        }
					}

	}

}
