package com.solutions.leetcode;

public class DefangingIPAddress {
	//approach 1
	 public String defangIPaddr(String address) {
	        String defangAddress = address.replace(".","[.]");
	            return defangAddress;
	         //return address.replace(".","[.]");
	    }
	 //approach 2
	 public String defangIPUsingStringBuffer(String address) {
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<address.length();i++) {
	        	if(address.charAt(i)=='.')
	        		sb.append("[.]");
	        	else sb.append(address.charAt(i));
	        }
	            return sb.toString();
	    }

	public static void main(String[] args) {
		DefangingIPAddress dia = new DefangingIPAddress();
		String address = "255.100.50.0";
		String res = dia.defangIPaddr(address);
		System.out.println(res);

	}

}
