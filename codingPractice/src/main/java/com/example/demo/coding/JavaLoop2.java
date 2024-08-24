package com.example.demo.coding;

import java.util.Scanner;

/* 
 Input q,a,b,n
 q = number of queries
create the following series

(a + 2^0 *b) + (a + 2^0*b + 2^1*b) + ... till 2^(n-1)


*/

public class JavaLoop2 {
	
	public static double calculateTheSeries(double a, double b , double count)
	{
		
		double sum = a+b;
		//System.out.println("count:"+count);
		//System.out.println("sum:"+sum);
		
		for(int j=1;j<=count;j++)
		{
			double value = (Math.pow(2, j))*b;
			//System.out.println("value:"+value);
			sum = sum + value;
			//System.out.println("sum:"+sum);
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		double q = scanner.nextDouble();
		
		
		
		
		
		while(q-- > 0)
		{
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double n = scanner.nextDouble();
			System.out.println("q:"+q);
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			System.out.println("n:"+n);
			
			for(int i=0;i<n;i++)
			{
				double valueOfSeries = calculateTheSeries(a,b,i);
				System.out.println(valueOfSeries);
			}
			
		}

	}

}
