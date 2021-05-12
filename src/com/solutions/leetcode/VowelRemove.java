package com.solutions.leetcode;

import java.util.Scanner;

public class VowelRemove {
	
	public String removeVowels(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))
				sb.append(s.charAt(i));
		    else
			    continue;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		VowelRemove vr =new VowelRemove();
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(vr.removeVowels(input));
	}

}
