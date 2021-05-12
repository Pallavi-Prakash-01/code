package com.solutions.leetcode;

public class LongestPalindromicSubstring {
	
	 public String longestPalindrome(String s) {
	        if(s.length()<=0 || s==null)
	            return "";
	        int start =0;
	        int end = 0;
	        for(int i =0;i<s.length();i++){
	            int len1 = expandAroundCenter(s,i,i);
	            int len2 = expandAroundCenter(s,i,i+1);
	            int len = Math.max(len1,len2);
	            if(len > end - start){
	                start = i-(len-1)/2;
	                end=i+len/2;
	            }
	        }
	        return s.substring(start,end+1);
	    }
	    private int expandAroundCenter(String s, int left,int right){
	        int l=left;
	        int r= right;
	        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
	            l--;
	            r++;
	        }
	        return r-l-1;
	    }

	public static void main(String[] args) {
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		String s = "ababd";
		String res = lps.longestPalindrome(s);
		System.out.println(res);
	}

}
