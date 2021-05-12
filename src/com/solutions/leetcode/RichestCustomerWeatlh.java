package com.solutions.leetcode;


public class RichestCustomerWeatlh {
	
	 public int maximumWealth(int[][] accounts) {
	        int sum =0;
	        int richest=0;
	        for(int i=0;i<accounts.length;i++){
	            for(int j=0;j<accounts[i].length;j++)
	                sum=sum+accounts[i][j];
	            richest = Math.max(sum,richest);
	            sum=0;
	        }
	        return richest;
	    }

	public static void main(String[] args) {
		RichestCustomerWeatlh rcw = new RichestCustomerWeatlh();
		int[][] accounts = {{1,5},{7,3},{3,5}};
		int res = rcw.maximumWealth(accounts);
		System.out.println(res);

	}

}
