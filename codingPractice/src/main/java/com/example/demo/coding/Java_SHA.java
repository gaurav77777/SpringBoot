package com.example.demo.coding;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


// Given a string, , print its SHA-256 hash value.



public class Java_SHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		String password = scan.next();
		System.out.println("password");
		
		try
		{
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(password.getBytes());
			byte [] digest = messageDigest.digest();
			
			System.out.println("digest:-"+digest);
			
			StringBuilder sb = new StringBuilder();
			for(byte b : digest) {
				//sb.append(String.format("%02x", b));
				sb.append(String.format("%x", b));
			}
			
			System.out.println(sb.toString());
			
			
		}
		
		catch(NoSuchAlgorithmException e)
		{
			System.out.println(e);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
