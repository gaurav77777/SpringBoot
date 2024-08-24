package com.example.demo.coding;

import java.util.Comparator;
import java.util.*;

/*Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.

Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; 
if  or more players have the same score, sort those players alphabetically by name. 
To do this, you must create a Checker class that implements the Comparator interface,
then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.*/


//Write your Checker class here

class Checker implements Comparator<Player>
{

	public int compare(Player i, Player j){
        if(i.score < j.score)
        {
            return 1;
        }
        else if(i.score == j.score)
        {
            if (i.name.compareTo(j.name)>=1) 
            {
                return 1;
            } 
            else 
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
    }	
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Java_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++)
        {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

	}

}
