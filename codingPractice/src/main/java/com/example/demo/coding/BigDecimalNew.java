package com.example.demo.coding;

import java.math.*;
import java.util.*;

public class BigDecimalNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        
        Comparator<String> myComparator = new Comparator<String>()
        {
            
            public int compare (String s1, String s2)
            {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a);
            }
        };
        
        Arrays.sort(s,0,n,myComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

	}

}
