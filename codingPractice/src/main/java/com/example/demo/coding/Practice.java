package com.example.demo.coding;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

// Question

/*Write a class called MyRegex which will contain a string pattern. 
You need to write a regular expression and assign it to the pattern 
such that it can be used to validate an IP address.

The IP address is a string in the form “A.B.C.D”, where the value of A, B, C, and D may range 
from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can’t be greater than 3.
 *
 *
 *
 *
 *
 */




public class Practice {
	
	
	public static boolean isIPAddress(String str)
	{
		
		String zeroto255 = "(\\d{1,2}|(0|1)\\d\\d|2[0-4]\\d|25[0-5])";
		//String zeroto255   = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		
		String regex = zeroto255 + "\\."
				+zeroto255 + "\\."
				+zeroto255 + "\\."
				+zeroto255;
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		Boolean result = matcher.matches();
		
		System.out.println("result "+result);
		
		return result;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ip = "000.17.234.23.23";
		System.out.println(ip);
		System.out.println(isIPAddress(ip));
		

	}

}
