package com.example.demo.coding;

/*Write a class called MyRegex which will contain a string pattern. 
You need to write a regular expression and assign it to the pattern 
such that it can be used to validate an IP address. 


The IP address is a string in the form “A.B.C.D”, where the value of A, B, C, and D may range 
from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can’t be greater than 3.

*/

import java.util.regex.*;

public class Regex {
	
	
	// Function to validate the IPs address.
    public static boolean isValidIPAddress(String ip)
    {
 
        // Regex for digit from 0 to 255.
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
 
        // Regex for a digit from 0 to 255 and
        // followed by a dot, repeat 4 times.
        // this is the regex to validate an IP address.
        String regex
            = zeroTo255 + "\\."
              + zeroTo255 + "\\."
              + zeroTo255 + "\\."
              + zeroTo255;
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the IP address is empty
        // return false
        if (ip == null) {
            return false;
        }
 
        // Pattern class contains matcher() method
        // to find matching between given IP address
        // and regular expression.
        Matcher m = p.matcher(ip);
 
        // Return if the IP address
        // matched the ReGex
        return m.matches();
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "000.12.12.034";
        System.out.println("Input: " + str1);
        System.out.println(
            "Output: "
            + isValidIPAddress(str1));
 

	}

}
