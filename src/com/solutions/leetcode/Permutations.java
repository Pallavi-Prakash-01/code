package com.solutions.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
	
	 public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> finalList = new LinkedList();
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(int num :nums)
	            list.add(num);
	        int n = nums.length;
	        findPermutations(list,finalList,n,0);
	        return finalList;
	    }
	    public void findPermutations(ArrayList<Integer> list,List<List<Integer>> finalList, int n,int index){
	        if(index==n) finalList.add(new ArrayList<Integer>(list));
	        for(int i=index;i<n;i++){
	            Collections.swap(list,index,i);
	            findPermutations(list,finalList,n,index+1);
	            Collections.swap(list,index,i);
	        }
	    }
	public static void main(String[] args) {
		Permutations p = new Permutations();
		int[] nums = {1,2,3};
		List<List<Integer>> res = p.permute(nums);
		System.out.println(res);

	}

}
