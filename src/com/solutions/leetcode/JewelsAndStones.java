package com.solutions.leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JewelsAndStones {
 //Approach 1 : BruteForce Approach
		public int numJewelsInStones(String jewels, String stones) {
		       int count =0;
		       for(int i=0;i<jewels.length();i++){
		           for(int j=0;j<stones.length();j++){
		               if(jewels.charAt(i)==stones.charAt(j))
		                   count++;
		               else continue;
		           }
		        } 
		        return count;
		    }
		
//Approach 2 : Using Hashset
		public int numJewelsInStones1(String jewels, String stones) { 
		       Set<Character> Jset = new HashSet();
		       int answer =0;
		       for(char j:jewels.toCharArray())
		             Jset.add(j);
		       
		       for(char s:stones.toCharArray()){
		              if(Jset.contains(s))
		                   answer++;
		       }
		    return answer;          
		}

	public static void main(String[] args) {
		JewelsAndStones jas = new JewelsAndStones();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the unique character for Jewel String(non repeating alphabets) ");
		String jewels = input.nextLine();
		System.out.println("Enter the Stones String ");
		String stones = input.nextLine();
		System.out.println("Number of Jewels in stones are : "+jas.numJewelsInStones(jewels, stones));
		System.out.println("Number of Jewels in stones using hashset are : "+jas.numJewelsInStones1(jewels, stones));

	}

}
