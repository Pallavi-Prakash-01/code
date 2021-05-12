package com.solutions.leetcode;

public class ShuffleTheArray {
	 public int[] shuffle(int[] nums, int n) {
	        int[] res = new int[nums.length];
	        int j=n;
	        for(int i=0;i<n;i++){
	             res[2*i]= nums[i];
	            res[2*(i)+1]= nums[n+i];
	        }
	        return res;
	    } 

	public static void main(String[] args) {
		ShuffleTheArray sta = new ShuffleTheArray();
		int[] nums = {1,2,3,4,4,3,2,1};
		int n=4;//arr.length/2
		int[] res = sta.shuffle(nums, n);
		System.out.println("The shuffled array is : ");
		for(int i=0;i<res.length;i++)
		System.out.println(res[i]);

	}

}
