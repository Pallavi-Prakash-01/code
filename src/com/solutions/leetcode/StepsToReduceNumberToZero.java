package com.solutions.leetcode;

import java.util.Scanner;

public class StepsToReduceNumberToZero {
	
	 public int numberOfSteps(int num) {
	        int count =0;
	        while(num!=0){ 
	            if(num%2==0)
	                num=num/2;
	            else
	                num = num-1;
	            count++;
	        }
	        return count;
	    }
	public static void main(String[] args) {
		StepsToReduceNumberToZero srn = new StepsToReduceNumberToZero();
		System.out.println("Enter a number : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Number of steps required to reduce entered number to zero are : "+srn.numberOfSteps(num));

	}

}
