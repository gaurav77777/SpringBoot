package com.example.demo.coding;


//print all the permutations of str



/*step 1: Remove the ith character in char ch

step 2: Get the remianing character in string ros

step 3: Call the method again using ros as input and "ans" as "ans+ch"

*/
  
  
 
public class Permutation {
	
	static int  loop =0;
	// Function to print all the permutations of str
    static void printPermutn(String str, String ans)
    {
 
        // If string is empty
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
            //System.out.println("ch :"+ch);
            //System.out.println("i :"+i);
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
            //System.out.println("str.substring(0, i)  :"+str.substring(0, i) );
            //System.out.println("str.substring(i + 1)  :"+str.substring(i + 1) );
            //System.out.println("ros  :"+ros );
 
            // Recursive call
            //System.out.println("loop  :"+loop );
            loop++;
            printPermutn(ros, ans + ch);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "abc";
        printPermutn(s, "");

	}

}
