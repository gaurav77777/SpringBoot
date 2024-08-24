package com.example.demo.coding;

import java.util.*;

/*Let's play a game on an array! You're standing at index 0 of an
n-element array named . From some index  (where ), 
you can perform one of the following moves:

Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell .
Move Forward:
If cell i+1 contains a zero, you can walk to cell .
If cell i+leap contains a zero, you can jump to cell .
If you're standing in cell n-1  or the value of i+leap>=n,
you can walk or jump off the end of the array and win the game.*/




/*In other words, you can move from index i to index i+1
,i-1 ,i+leap  as long as the destination index is a cell containing a 0. 
If the destination index is greater than n-1, you win the game.*/

public class Java1DArrayPart2 {
	
	public static boolean canWin(int leap, int[] game, int start) {
        // Return true if you can win the game; otherwise, return false.
		
		boolean result=false;
		try
		{
        
		    if(game[0]==0)
		    {
				/*
				 * for(int i=start;i<game.length;i++) {
				 */
		    		if((start+leap)>=game.length)
		    		{
		    			System.out.println("Inside first if");
		    			System.out.println("Inside first if"+result);
		    			result =true;
		    			System.out.println("Inside first if"+result);
		    			return result;
		    		}
		    		if((start+leap)<game.length && game[start+leap]==0)
		    		//if((i+leap)<game.length-1)	
		    		{
		    			System.out.println("Inside second if");
		    			return canWin(leap,game,start+leap);
		    		}
		    	//}
		    }
		    else
		    {
		    	return result;
		    }
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		    
		    return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		
		{
		
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		
		
		for(int i=0;i<q;i++)
		{
			int n = scan.nextInt();
			int leap = scan.nextInt();
			int [] game = new int[n];
			
			for(int j=0;j<n;j++)
			{
				
				game[j]=scan.nextInt();
			}
			System.out.println(canWin(leap,game,0)?"True":"false");
					
		}	
		
	}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
			
		
		

	}

}
