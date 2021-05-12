package com.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> finalList = new ArrayList<>();
	        ArrayList<Integer> list = new ArrayList<>();
	        findAllWays(candidates,finalList,list,0,target);
	        return finalList;
	    }
	    
	    void findAllWays(int[] candidates,List<List<Integer>> finalList,ArrayList<Integer> list,int i,int target){
	        if(target == 0) 
	            finalList.add(new ArrayList<Integer>(list));
	        else{
	            int j;
	            for(j=i;j<candidates.length;j++){
	                if(candidates[j]<=target){
	                    list.add(candidates[j]);
	                    findAllWays(candidates,finalList,list,j,target-candidates[j]);
	                    list.remove(list.size()-1);
	                }
	            }
	        }
	    }

	public static void main(String[] args) {
		Combinations c = new Combinations();
		int target = 7;
		int[] candidates = {2,3,6,7};
		List<List<Integer>> finalValue = c.combinationSum(candidates,target);
		System.out.println(finalValue);

	}

}
