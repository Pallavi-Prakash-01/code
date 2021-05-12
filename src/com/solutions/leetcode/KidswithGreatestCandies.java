package com.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidswithGreatestCandies {
	
	  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        int max = -1;
	       for(int i=0;i<candies.length;i++){
	           max=Math.max(max,candies[i]);
	       } 
	        List<Boolean> checkList = new ArrayList<Boolean>();
	        for(int i=0;i<candies.length;i++){
	            if(candies[i]+extraCandies>=max){
	                checkList.add(true);
	              }
	            else checkList.add(false);
	        }
	       return checkList; 
	    }

	public static void main(String[] args) {
		KidswithGreatestCandies kwc = new KidswithGreatestCandies();
		int[] candies = {2,3,5,1,3}; 
		int extraCandies = 3;
		System.out.println(kwc.kidsWithCandies(candies, extraCandies));

	}

}
