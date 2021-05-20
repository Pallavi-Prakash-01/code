package com.solutions.leetcode;

public class DecodeXoredArray {

	 public int[] decode(int[] encoded, int first) {
	        int[] arr = new int[encoded.length + 1];
	        arr[0] = first;
	        for(int i=0; i<encoded.length; i++)
	        {
	            arr[i+1] = arr[i] ^ encoded[i]; 
	        }
	        return arr;
	    }
	 
	public static void main(String[] args) {
		DecodeXoredArray dxa = new DecodeXoredArray();
		int[] nums = {6,2,7,3};
		int first = 4;
		int[] res = new int[nums.length+1];
		res = dxa.decode(nums, first);
		System.out.println("The original decoded array is : ");
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");

	}

}
