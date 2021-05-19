package com.solutions.leetcode;

public class DecompressList {
	
	 public int[] decompressRLElist(int[] nums) {
	        int frequency=0,size=0,k=0;
	        for(int i=0;i<nums.length;i=i+2){
	            frequency=nums[i];
	            size=size+frequency;
	         }
	        int[] list = new int[size];
	        for(int i=0;i<nums.length;i=i+2){
	            frequency = nums[i];
	            for(int j=0;j<frequency;j++)
	                list[k++] = nums[i+1];
	        }
	     return list;   
	}

	public static void main(String[] args) {
		DecompressList dl = new DecompressList();
		int[] nums = {1,2,3,4};
		int[] res = dl.decompressRLElist(nums);
		System.out.println("Decompress Run-Length Encoded List : ");
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}

}
