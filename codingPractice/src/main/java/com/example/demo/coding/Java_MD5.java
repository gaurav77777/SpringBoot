package com.example.demo.coding;


import java.io.*;
import java.util.*;
import java.math.BigInteger; 
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Java_MD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
        {
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        //System.out.println(password);
        MessageDigest md = MessageDigest.getInstance("MD5");  
        byte[] result = md.digest(password.getBytes()); 
        BigInteger b=new BigInteger(1,result);
        System.out.println(b.toString(16));
        
    }
        catch(NoSuchAlgorithmException ex){
            System.out.println(ex.getMessage());
        }
        

	}

}
