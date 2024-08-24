package com.example.demo.coding;

import java.util.*;
import java.util.regex.*;

public class TagContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
            boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<])</\\1>");
            Matcher match = pattern.matcher(line);
            
            
            while(match.find())
            {
            	System.out.println(match.group(0));
            	System.out.println(match.group(1));
                System.out.println(match.group(2));
                matchFound=true;
            }
            if(!matchFound)
            {
                System.out.println("None");
            }
            
			
          	//Write your code here
			
			testCases--;
		}
        in.close();

	}

}
