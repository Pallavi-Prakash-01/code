package com.solutions.leetcode;

public class StringtoIntAtoi {
	
	  public int myAtoi(String s) {
	        if(s.length()<=0 || s==null)
	            return 0;
	        char flag = '+';
	        int i=0;
	        double res=0;
	        while(i<s.length() && s.charAt(i)==' ') {
	        	i++;
	        }
	        if(i<s.length()) {
	        if(s.charAt(i)=='-'){
	            flag ='-';
	            i++;
	        }
	        else if(s.charAt(i)=='+')
	               i++;
	        while(s.length()>i && s.charAt(i)>='0' && s.charAt(i)<='9'){
	            res = res*10 + (s.charAt(i) - '0');
	            i++;
	        }
	        if(flag == '-')
	            res=-res;
	        
	        if(res>Integer.MAX_VALUE)
	            return Integer.MAX_VALUE;
	        if(res<Integer.MIN_VALUE)
	            return Integer.MIN_VALUE;
	        }  
	        return (int) res;
	    }

	public static void main(String[] args) {
		StringtoIntAtoi sti = new StringtoIntAtoi();
		String s = " ";
		int res = sti.myAtoi(s);
		System.out.println(res);
	}

}
